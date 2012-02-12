package com.hascode.tutorial.pagemodel;

import org.jbehave.web.selenium.WebDriverProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

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

        get("file://localhost/Users/svenruchti/Dropbox/Master%20Thesis/TaschenrechnerProjekt/src/Taschenrechner.html");
    }
}
