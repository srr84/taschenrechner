import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Setup {

    //Setup the Firfox Driver
    WebDriver driver = new FirefoxDriver();
    //driver.get("http://www.google.com");
    
    
    public WebDriver getDriver() {
        
       return driver; 
    }

    public void quit() {

        //Close the browser
        driver.quit();
    }
}

