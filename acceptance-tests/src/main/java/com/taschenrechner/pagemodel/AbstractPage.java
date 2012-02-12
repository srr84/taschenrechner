package com.hascode.tutorial.pagemodel;

import org.jbehave.web.selenium.WebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;

/**
 * Created by IntelliJ IDEA.
 * User: svenruchti
 * Date: 12.02.12
 * Time: 16:55
 * To change this template use File | Settings | File Templates.
 */
public class AbstractPage extends WebDriverPage {

    public AbstractPage(WebDriverProvider driverProvider) {
        super(driverProvider);
    }
}
