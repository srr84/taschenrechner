package com.hascode.tutorial.pagemodel;

import org.jbehave.web.selenium.WebDriverProvider;

public class Pages {

    private final WebDriverProvider driverProvider;
    private SetupPageModel setupPageModel;
    private TaschenrechnerPageModel taschenrechnerPageModel;
    // More pages as needed

    public Pages(WebDriverProvider driverProvider) {
        this.driverProvider = driverProvider;
    }

    public WebDriverProvider getDriverProvider() {

        return driverProvider;
    }

    public SetupPageModel setup(){
        if ( setupPageModel == null ){
            setupPageModel = new SetupPageModel(driverProvider);
        }
        return setupPageModel;
    }

    public TaschenrechnerPageModel taschenrechner(){
        if ( taschenrechnerPageModel == null ){
            taschenrechnerPageModel = new TaschenrechnerPageModel(driverProvider);
        }
        return taschenrechnerPageModel;
    }
}