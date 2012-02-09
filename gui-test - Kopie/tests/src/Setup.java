import org.junit.AfterClass;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
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

    static WebDriver driver = new FirefoxDriver();
    static WebDriverWait wait = new WebDriverWait(driver, 10);
    static final String URL = "http://www.google.com";

    public static void setup() {

        driver.get(URL);
    }

    public static WebDriver driver() {

        return driver;
    }


    public static void quit() {

        driver.quit();
    }
}
