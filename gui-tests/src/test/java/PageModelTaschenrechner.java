import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import static junit.framework.Assert.assertEquals;

/**
 * Created by IntelliJ IDEA.
 * User: Ruchti
 * Date: 09.02.12
 * Time: 16:55
 * To change this template use File | Settings | File Templates.
 */
public class PageModelTaschenrechner extends AbstractPageModel {

    private static final Logger logger = LoggerFactory.getLogger(PageModelTaschenrechner.class);

    //Webelements
    final static WebElement NULL = driver.findElement(By.xpath("//input[@value='  0   ']"));
    final static WebElement EINS = driver.findElement(By.xpath("//input[@value='  1   ']"));
    final static WebElement ZWEI = driver.findElement(By.xpath("//input[@value='  2   ']"));
    final static WebElement DREI = driver.findElement(By.xpath("//input[@value='  3   ']"));
    final static WebElement VIER = driver.findElement(By.xpath("//input[@value='  4   ']"));
    final static WebElement FUENF = driver.findElement(By.xpath("//input[@value='  5   ']"));
    final static WebElement SECHS = driver.findElement(By.xpath("//input[@value='  6   ']"));
    final static WebElement SIEBEN = driver.findElement(By.xpath("//input[@value='  7   ']"));
    final static WebElement ACHT = driver.findElement(By.xpath("//input[@value='  8   ']"));
    final static WebElement NEUN = driver.findElement(By.xpath("//input[@value='  9   ']"));
    final static WebElement PUNKT = driver.findElement(By.xpath("//input[@value='  .   ']"));
    final static WebElement PLUS = driver.findElement(By.xpath("//input[@value='  +   ']"));
    final static WebElement MINUS = driver.findElement(By.xpath("//input[@value='  -   ']"));
    final static WebElement MULTI = driver.findElement(By.xpath("//input[@value='  *   ']"));
    final static WebElement DIVISION = driver.findElement(By.xpath("//input[@value='  /   ']"));
    final static WebElement WURZEL = driver.findElement(By.xpath("//input[@value='sqrt ']"));
    final static WebElement LOESCHEN = driver.findElement(By.xpath("//input[@value='  C  ']"));
    final static WebElement LOGARITHMUS = driver.findElement(By.xpath("//input[@value=' ln ']"));
    final static WebElement QUADRAT = driver.findElement(By.xpath("//input[@value=' pow ']"));
    final static WebElement EINGABEFELD = driver.findElement(By.name("Display"));
    final static WebElement ERGEBNIS = driver.findElement(By.xpath("//input[@value='  =   ']"));


    public static void eingeben(String eingabe) {

        logger.info("Eingeben " + eingabe);
        EINGABEFELD.sendKeys(eingabe);
    }

    public static void eingabeLoeschen() {

        logger.info("Loeschen der Eingaben");
        EINGABEFELD.clear();
    }

    public static void eingabeLoeschenMitC() {

        LOESCHEN.click();
    }

    public static void klicken(WebElement taste) {

        logger.info("Klicken von: " + taste);
        taste.click();
    }

    public static void ergebnis() {

        ERGEBNIS.click();
    }


    public static void addierenMitButton(int ersteZahl, int zweiteZahl, int ergebnis) {

        logger.info("Addieren mit Button von " + ersteZahl + " und " + zweiteZahl);
        klicken(getWebelementFromInt(ersteZahl));
        klicken(PLUS);
        klicken(getWebelementFromInt(zweiteZahl));
        klicken(ERGEBNIS);
        assertEquals("" + ergebnis, EINGABEFELD.getAttribute("value"));
    }

    public static void addierenMitTastatur(int ersteZahl, int zweiteZahl, int ergebnis) {

        logger.info("Addieren mit Tastatur von " + ersteZahl + " und " + zweiteZahl);
        eingeben("" + ersteZahl);
        eingeben("+");
        eingeben("" + zweiteZahl);
        klicken(ERGEBNIS);
        assertEquals("" + ergebnis, EINGABEFELD.getAttribute("value"));
    }

    public static void subtrahierenMitButton(int ersteZahl, int zweiteZahl, int ergebnis) {

        klicken(getWebelementFromInt(ersteZahl));
        klicken(MINUS);
        klicken(getWebelementFromInt(zweiteZahl));
        klicken(ERGEBNIS);
        assertEquals("" + ergebnis, EINGABEFELD.getAttribute("value"));
    }

    public static void subtrahierenMitTastatur(int ersteZahl, int zweiteZahl, int ergebnis) {

        eingeben("" + ersteZahl);
        eingeben("-");
        eingeben("" + zweiteZahl);
        klicken(ERGEBNIS);
        assertEquals("" + ergebnis, EINGABEFELD.getAttribute("value"));
    }


    public static void multiplizierenMitButton(int ersteZahl, int zweiteZahl, int ergebnis) {

        klicken(getWebelementFromInt(ersteZahl));
        klicken(MULTI);
        klicken(getWebelementFromInt(zweiteZahl));
        klicken(ERGEBNIS);
        assertEquals("" + ergebnis, EINGABEFELD.getAttribute("value"));
    }

    public static void multiplizierenMitTastatur(int ersteZahl, int zweiteZahl, int ergebnis) {

        eingeben("" + ersteZahl);
        eingeben("*");
        eingeben("" + zweiteZahl);
        klicken(ERGEBNIS);
        assertEquals("" + ergebnis, EINGABEFELD.getAttribute("value"));
    }

    public static void dividierenMitButton(int ersteZahl, int zweiteZahl, int ergebnis) {

        klicken(getWebelementFromInt(ersteZahl));
        klicken(DIVISION);
        klicken(getWebelementFromInt(zweiteZahl));
        klicken(ERGEBNIS);
        assertEquals("" + ergebnis, EINGABEFELD.getAttribute("value"));
    }

    public static void dividierenMitTastatur(int ersteZahl, int zweiteZahl, int ergebnis) {

        eingeben("" + ersteZahl);
        eingeben("/");
        eingeben("" + zweiteZahl);
        klicken(ERGEBNIS);
        assertEquals("" + ergebnis, EINGABEFELD.getAttribute("value"));
    }

    public static void quadrierenMitButton(int zahl, int ergebnis) {

        klicken(getWebelementFromInt(zahl));
        klicken(QUADRAT);
        klicken(ERGEBNIS);
        assertEquals("" + ergebnis, EINGABEFELD.getAttribute("value"));
    }


    public static void wurzelMitButton(int zahl, int ergebnis) {

        klicken(getWebelementFromInt(zahl));
        klicken(WURZEL);
        klicken(ERGEBNIS);
        assertEquals("" + ergebnis, EINGABEFELD.getAttribute("value"));
    }


    public static void logarithmusMitButton(int zahl, int ergebnis) {

        klicken(getWebelementFromInt(zahl));
        klicken(LOGARITHMUS);
        klicken(ERGEBNIS);
        assertEquals("" + ergebnis, EINGABEFELD.getAttribute("value"));
    }


    public static void loeschenMitButton() {

        klicken(LOESCHEN);
        assertEquals("", EINGABEFELD.getAttribute("value"));
    }

    private static WebElement getWebelementFromInt(int wert) {

        switch (wert) {
            case 0:
                return NULL;
            case 1:
                return EINS;
            case 2:
                return ZWEI;
            case 3:
                return DREI;
            case 4:
                return VIER;
            case 5:
                return FUENF;
            case 6:
                return SECHS;
            case 7:
                return SIEBEN;
            case 8:
                return ACHT;
            case 9:
                return NEUN;
        }
        return null;
    }

}