package org.sven.ruchti;

import org.sven.ruchti.pages.Pages;
import org.sven.ruchti.steps.TaschenrechnerSteps;
import java.util.List;

import org.jbehave.core.Embeddable;
import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.io.LoadFromClasspath;
import org.jbehave.core.io.StoryFinder;
import org.jbehave.core.junit.JUnitStories;
import org.jbehave.core.reporters.CrossReference;
import org.jbehave.core.reporters.Format;
import org.jbehave.core.reporters.StoryReporterBuilder;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;
import org.jbehave.core.steps.SilentStepMonitor;
import org.jbehave.web.selenium.*;

import static java.util.Arrays.asList;
import static org.jbehave.core.io.CodeLocations.codeLocationFromClass;
import static org.jbehave.core.reporters.Format.*;
import static org.jbehave.web.selenium.WebDriverHtmlOutput.WEB_DRIVER_HTML;

public class TaschenrechnerStories extends JUnitStories {

    private WebDriverProvider driverProvider = new PropertyWebDriverProvider();
    private WebDriverSteps lifecycleSteps = new PerStoriesWebDriverSteps(driverProvider); // or PerStoryWebDriverSteps(driverProvider)
    private CrossReference crossReference = new CrossReference().withJsonOnly().withOutputAfterEachStory(true)
            .excludingStoriesWithNoExecutedScenarios(true);
    private Pages pages = new Pages(driverProvider);
    private SeleniumContext context = new SeleniumContext();
    private ContextView contextView = new LocalFrameContextView().sized(500, 100);

    private Format[] formats = new Format[] { new SeleniumContextOutput(context), TXT, HTML, CONSOLE, WEB_DRIVER_HTML };
    private StoryReporterBuilder reporterBuilder = new StoryReporterBuilder()
            .withCodeLocation(codeLocationFromClass(TaschenrechnerStories.class)).withFailureTrace(true)
            .withFailureTraceCompression(true).withDefaultFormats().withFormats(formats)
            .withCrossReference(crossReference);

    /*public TaschenrechnerStories() {
        if ( lifecycleSteps instanceof PerStoriesWebDriverSteps ){
            configuredEmbedder().useExecutorService(MoreExecutors.sameThreadExecutor());
        }
    } */

    
    @Override
    public Configuration configuration() {
        Class<? extends Embeddable> embeddableClass = this.getClass();
        return new SeleniumConfiguration()
                .useSeleniumContext(context)
                .useWebDriverProvider(driverProvider)
                .useStepMonitor(new SeleniumStepMonitor(contextView, context, new SilentStepMonitor()))
                .useStoryLoader(new LoadFromClasspath(embeddableClass))
                .useStoryReporterBuilder(reporterBuilder);
    }

    @Override
    public InjectableStepsFactory stepsFactory() {
        Configuration configuration = configuration();
        return new InstanceStepsFactory(configuration,
                new TaschenrechnerSteps(pages),
                lifecycleSteps,
                new WebDriverScreenshotOnFailure(driverProvider, configuration.storyReporterBuilder()));
    }


    @Override
    protected List<String> storyPaths() {
        String bla = codeLocationFromClass(this.getClass()).getFile();
        System.out.println("Bla: " + bla);
        System.out.println("Location:" + codeLocationFromClass(this.getClass()));

        List<String> sf = new StoryFinder().findPaths(codeLocationFromClass(this.getClass()).getFile(), asList("**/*rechner.story"), null);
        System.out.println("SF: " + sf.size());
        return new StoryFinder()
                .findPaths(codeLocationFromClass(this.getClass()).getFile(), asList("**/*.story"), null);
    }

    // This Embedder is used by Maven or Ant and it will override anything set in the constructor
    /*public static class SameThreadEmbedder extends Embedder {

        public SameThreadEmbedder() {
            useExecutorService(MoreExecutors.sameThreadExecutor());
        }

    } */


}
