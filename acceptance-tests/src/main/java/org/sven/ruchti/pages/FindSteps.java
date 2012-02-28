package org.sven.ruchti.pages;

import org.jbehave.web.selenium.WebDriverProvider;
import org.openqa.selenium.By;

/**
 * Created by IntelliJ IDEA.
 * User: svenruchti
 * Date: 28.02.12
 * Time: 00:32
 * To change this template use File | Settings | File Templates.
 */
public class FindSteps extends AbstractPage {

    public FindSteps(WebDriverProvider driverProvider) {
        super(driverProvider);
    }

    public void open(){
        get("file://localhost/Users/svenruchti/Dropbox/Master_Thesis/taschenrechner/src/Taschenrechner.html");
        //findElement(By.linkText("Find Steps")).click();
    }

}
