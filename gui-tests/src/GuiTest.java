import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Wait;

public class GuiTest {

    static final WebDriver driver = Setup.getDriver();
    static final WebDriverWait wait = Setup.getWait();

    @BeforeClass
    public static void init() {
        
        Setup.setup();
    }

    @Before
    public void reset() {

        PageModel.löschenMitButton();
    }

    @Test
    public void addieren() {

       PageModel.addierenMitButton(1, 2 ,3);
       PageModel.löschenMitButton();
       PageModel.addierenMitTastatur(1, 2, 3);
    }

    @Test
    public void subtrahieren() {

        PageModel.subtrahierenMitButton(5, 2 ,3);
        PageModel.löschenMitButton();
        PageModel.subtrahierenMitTastatur(5, 2, 3);
    }

    @Test
    public void multiplizieren() {

        PageModel.multiplizierenMitButton(4, 3 , 12);
        PageModel.löschenMitButton();
        PageModel.multiplizierenMitTastatur(4, 3, 12);
    }

    @Test
    public void dividieren() {

        PageModel.dividierenMitButton(9, 3 , 3);
        PageModel.löschenMitButton();
        PageModel.dividierenMitTastatur(9, 3, 3);
    }

    @Test
    public void quadrieren() {

       PageModel.quadrierenMitButton(5, 25);
    }

    @Test
    public void wurzel() {

        PageModel.wurzelMitButton(9, 3);
    }

    @Test
    public void logarithmus() {


    }

    @Test
    public void löschen() {

        PageModel.addierenMitButton(1, 2 ,3);
        PageModel.löschenMitButton();
        PageModel.addierenMitTastatur(1, 2, 3);
        PageModel.löschenMitButton();
    }

    @AfterClass
    public static void shutdown() {

        Setup.quit();
    }
}

