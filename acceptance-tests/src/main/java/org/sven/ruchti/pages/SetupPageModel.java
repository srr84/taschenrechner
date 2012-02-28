package org.sven.ruchti.pages;

import org.jbehave.web.selenium.WebDriverProvider;

import static org.junit.Assert.assertEquals;

/**
 * Created by IntelliJ IDEA.
 * User: svenruchti
 * Date: 12.02.12
 * Time: 16:54
 * To change this template use File | Settings | File Templates.
 */
public class SetupPageModel extends AbstractPage {

    public SetupPageModel(WebDriverProvider driverProvider) {
        super(driverProvider);
    }

    public void open () {
		//This the url for the jenkins job, please change that locally!!!
        get("file://file:///Users/Shared/Jenkins/Home/workspace/Akzeptanz_Tests/src/Taschenrechner.html");
    }
}
