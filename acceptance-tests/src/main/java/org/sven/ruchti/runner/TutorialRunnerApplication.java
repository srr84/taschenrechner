package com.hascode.tutorial.runner;

import java.util.List;

import org.jbehave.core.steps.CandidateSteps;
import org.jbehave.core.steps.InstanceStepsFactory;
import org.jbehave.web.runner.wicket.WebRunnerApplication;
import org.sven.ruchti.steps.TaschenrechnerSteps;

public class TutorialRunnerApplication extends WebRunnerApplication {
	@Override
	protected List<CandidateSteps> candidateSteps() {
		return new InstanceStepsFactory(configuration(), TaschenrechnerSteps.class).createCandidateSteps();
	}
}
