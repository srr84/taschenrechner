import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class GuiTest {

    @BeforeClass
    public static void init() {
        
        AbstractPageModel.setup();
    }

    @Before
    public void reset() {

        PageModelTaschenrechner.loeschenMitButton();
    }

    @Test
    public void addieren() {

       PageModelTaschenrechner.addierenMitButton(1, 2, 3);
       PageModelTaschenrechner.loeschenMitButton();
       PageModelTaschenrechner.addierenMitTastatur(1, 2, 3);
    }

    @Test
    public void subtrahieren() {

        PageModelTaschenrechner.subtrahierenMitButton(5, 2, 3);
        PageModelTaschenrechner.loeschenMitButton();
        PageModelTaschenrechner.subtrahierenMitTastatur(5, 2, 3);
    }

    @Test
    public void multiplizieren() {

        PageModelTaschenrechner.multiplizierenMitButton(4, 3, 12);
        PageModelTaschenrechner.loeschenMitButton();
        PageModelTaschenrechner.multiplizierenMitTastatur(4, 3, 12);
    }

    @Test
    public void dividieren() {

        PageModelTaschenrechner.dividierenMitButton(9, 3, 3);
        PageModelTaschenrechner.loeschenMitButton();
        PageModelTaschenrechner.dividierenMitTastatur(9, 3, 3);
    }

    @Test
    public void quadrieren() {

       PageModelTaschenrechner.quadrierenMitButton(5, 25);
    }

    @Test
    public void wurzel() {

        PageModelTaschenrechner.wurzelMitButton(9, 3);
    }

    @Test
    public void logarithmus() {


    }

    @Test
    public void loeschen() {

        PageModelTaschenrechner.addierenMitButton(1, 2, 3);
        PageModelTaschenrechner.loeschenMitButton();
        PageModelTaschenrechner.addierenMitTastatur(1, 2, 3);
        PageModelTaschenrechner.loeschenMitButton();
    }

    @AfterClass
    public static void shutdown() {

        AbstractPageModel.quit();
    }
}

