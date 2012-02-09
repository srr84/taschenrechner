import org.junit.AfterClass;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by IntelliJ IDEA.
 * User: Ruchti
 * Date: 09.02.12
 * Time: 16:56
 * To change this template use File | Settings | File Templates.
 */
public class Setup {

    private static WebDriver driver = new FirefoxDriver();
    private static WebDriverWait wait = new WebDriverWait(driver, 10);
    private static final String URL = "file:///C:/Users/Ruchti/Desktop/My%20Dropbox/Master%20Thesis/taschenrechner/src/main/Taschenrechner.html";

    public static void setup() {

        driver.get(URL);
    }

    public static WebDriver getDriver() {

        return driver;
    }
    
    public static WebDriverWait getWait() {
        
        return wait;
    }


    public static void quit() {

        driver.quit();
    }
}
