import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Wait;
import javax.inject.Inject;

public class GuiTest {


    @Before
    public void init() {
        
        Setup.setup();
    }
    
    @Test
    public void test() {

        
        // Find the text input element by its name
        WebElement element = Setup.driver().findElement(By.name("q"));

        // Enter something to search for
        element.sendKeys("Cheese!");

        // Now submit the form. WebDriver will find the form for us from the element
        element.submit();

        // Check the title of the page
        System.out.println("Page title is: " + driver.getTitle());

        // Google's search is rendered dynamically with JavaScript.
        // Wait for the page to load, timeout after 10 seconds
        Setup.wait.until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver webDriver) {
                return webDriver.findElement(By.id("resultStats")) != null;
            }
        });


        // Should see: "cheese! - Google Search"
        System.out.println("Page title is: " + driver.getTitle());    
    }

//    @Test
//    public void addieren() {
//
//       PageModel.addierenMitButton(1, 2 ,3);
//       PageModel.addierenMitTastatur(1, 2, 3);
//    }
//
//    @Test
//    public void subtrahieren() {
//
//        PageModel.subtrahierenMitButton(5, 2 ,3);
//        PageModel.subtrahierenMitTastatur(5, 2, 3);
//    }
//
//    @Test
//    public void multiplizieren() {
//
//        PageModel.multiplizierenMitButton(4, 3 , 12);
//        PageModel.multiplizierenMitTastatur(4, 3, 12);
//    }
//
//    @Test
//    public void dividieren() {
//
//        PageModel.multiplizierenMitButton(12, 3 , 4);
//        PageModel.multiplizierenMitTastatur(12, 3, 4);
//    }
//
//    @Test
//    public void quadrieren() {
//
//       PageModel.quadrierenMitButton(5, 25);
//    }
//
//    @Test
//    public void wurzel() {
//
//        PageModel.wurzelMitButton(25, 5);
//    }
//
//    @Test
//    public void logarithmus() {
//
//
//    }
//
//    @Test
//    public void löschen() {
//
//        PageModel.addierenMitButton(1, 2 ,3);
//        PageModel.löschenMitButton();
//        PageModel.addierenMitTastatur(1, 2, 3);
//        PageModel.löschenMitButton();
//    }

    @AfterClass
    public void shutdown() {

        Setup.quit();
    }
}

