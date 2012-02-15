
import org.junit.AfterClass;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import static org.slf4j.LoggerFactory.getLogger;

/**
 * Created by IntelliJ IDEA.
 * User: Ruchti
 * Date: 09.02.12
 * Time: 16:56
 * To change this template use File | Settings | File Templates.
 */

public abstract class AbstractPageModel {

    private static Logger logger = getLogger(AbstractPageModel.class);
    protected static WebDriver driver = new FirefoxDriver();
    protected static WebDriverWait wait = new WebDriverWait(driver, 10);
    protected static final String URL = "file://localhost/Users/svenruchti/Dropbox/Master%20Thesis/taschenrechner/src/Taschenrechner.html";

    public static void setup() {
        
        logger.info("Oeffnen von : " + URL);
        driver.get(URL);
    }

    public static void quit() {

        logger.info("Quit");
        driver.quit();
    }
    
}
