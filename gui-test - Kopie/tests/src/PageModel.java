import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Mouse;
import org.openqa.selenium.WebElement;

import static junit.framework.Assert.assertEquals;

/**
 * Created by IntelliJ IDEA.
 * User: Ruchti
 * Date: 09.02.12
 * Time: 16:55
 * To change this template use File | Settings | File Templates.
 */
public class PageModel {

    //Webelements
    final static WebElement NULL = Setup.driver().findElement(By.xpath("//input[@value='  0   ']"));
    final static WebElement EINS = Setup.driver().findElement(By.xpath("//input[@value='  1   ']"));
    final static WebElement ZWEI = Setup.driver().findElement(By.xpath("//input[@value='  2   ']"));
    final static WebElement DREI = Setup.driver().findElement(By.xpath("//input[@value='  3   ']"));
    final static WebElement VIER = Setup.driver().findElement(By.xpath("//input[@value='  4   ']"));
    final static WebElement FUENF = Setup.driver().findElement(By.xpath("//input[@value='  5   ']"));
    final static WebElement SECHS = Setup.driver().findElement(By.xpath("//input[@value='  6   ']"));
    final static WebElement SIEBEN = Setup.driver().findElement(By.xpath("//input[@value='  7   ']"));
    final static WebElement ACHT = Setup.driver().findElement(By.xpath("//input[@value='  8   ']"));
    final static WebElement NEUN = Setup.driver().findElement(By.xpath("//input[@value='  9   ']"));
    final static WebElement PLUS = Setup.driver().findElement(By.xpath("//input[@value='  +   ']"));
    final static WebElement MINUS = Setup.driver().findElement(By.xpath("//input[@value='  -   ']"));
    final static WebElement MULTI = Setup.driver().findElement(By.xpath("//input[@value='  *   ']"));
    final static WebElement DIVISION = Setup.driver().findElement(By.xpath("//input[@value='  /   ']"));
    final static WebElement WURZEL = Setup.driver().findElement(By.xpath("//input[@value='sqrt ']"));
    final static WebElement LOESCHEN = Setup.driver().findElement(By.xpath("//input[@value='  C  ']"));
    final static WebElement LOGARITHMUS = Setup.driver().findElement(By.xpath("//input[@value=' ln ']"));
    final static WebElement QUADRAT = Setup.driver().findElement(By.xpath("//input[@value=' pow ']"));
    final static WebElement EINGABEFELD = Setup.driver().findElement(By.name("Display"));
    final static WebElement ERGEBNIS = Setup.driver().findElement(By.xpath("//input[@value='  =   ']"));


    public static void eingeben(String eingabe) {

        EINGABEFELD.sendKeys(eingabe);
    }

    public static void eingabeLoeschen() {

        EINGABEFELD.clear();
    }

    public static void eingabeLoeschenMitC() {

        LOESCHEN.click();
    }

    public static void klicken(WebElement taste) {

        taste.click();
    }

    public static void ergebnis() {

        ERGEBNIS.click();
    }

    
    public static void addierenMitButton(int ersteZahl, int zweiteZahl, int ergebnis) {

        klicken(getWebelementFromInt(ersteZahl));
        klicken(PLUS);
        klicken(getWebelementFromInt(zweiteZahl));
        assertEquals("" + ergebnis, EINGABEFELD.getText());
    }

    public static void addierenMitTastatur(int ersteZahl, int zweiteZahl, int ergebnis) {

        eingeben("" + ersteZahl);
        eingeben("+");
        eingeben("" + zweiteZahl);
        assertEquals("" + ergebnis, EINGABEFELD.getText());
    }
    
    public static void subtrahierenMitButton(int ersteZahl, int zweiteZahl, int ergebnis) {

        klicken(getWebelementFromInt(ersteZahl));
        klicken(MINUS);
        klicken(getWebelementFromInt(zweiteZahl));
        assertEquals("" + ergebnis, EINGABEFELD.getText());
    }

    public static void subtrahierenMitTastatur(int ersteZahl, int zweiteZahl, int ergebnis) {

        eingeben("" + ersteZahl);
        eingeben("-");
        eingeben("" + zweiteZahl);
        assertEquals("" + ergebnis, EINGABEFELD.getText());
    }

    
    public static void multiplizierenMitButton(int ersteZahl, int zweiteZahl, int ergebnis) {

        klicken(getWebelementFromInt(ersteZahl));
        klicken(MULTI);
        klicken(getWebelementFromInt(zweiteZahl));
        assertEquals("" + ergebnis, EINGABEFELD.getText());
    }

    public static void multiplizierenMitTastatur(int ersteZahl, int zweiteZahl, int ergebnis) {

        eingeben("" + ersteZahl);
        eingeben("*");
        eingeben("" + zweiteZahl);
        assertEquals("" + ergebnis, EINGABEFELD.getText());
    }
    
    public static void dividierenMitButton(int ersteZahl, int zweiteZahl, int ergebnis) {

        klicken(getWebelementFromInt(ersteZahl));
        klicken(DIVISION);
        klicken(getWebelementFromInt(zweiteZahl));
        assertEquals("" + ergebnis, EINGABEFELD.getText());
    }

    public static void dividierenMitTastatur(int ersteZahl, int zweiteZahl, int ergebnis) {

        eingeben("" + ersteZahl);
        eingeben("/");
        eingeben("" + zweiteZahl);
        assertEquals("" + ergebnis, EINGABEFELD.getText());
    }
    
    public static void quadrierenMitButton(int zahl, int ergebnis) {

        klicken(getWebelementFromInt(zahl));
        klicken(QUADRAT);
        assertEquals("" + ergebnis, EINGABEFELD.getText());
    }

    
    public static void wurzelMitButton(int zahl, int ergebnis) {

        klicken(getWebelementFromInt(zahl));
        klicken(WURZEL);
        assertEquals("" + ergebnis, EINGABEFELD.getText());
    }

    
    public static void logarithmusMitButton(int zahl, int ergebnis) {

        klicken(getWebelementFromInt(zahl));
        klicken(LOGARITHMUS);
        assertEquals("" + ergebnis, EINGABEFELD.getText());
    }

    
    public static void löschenMitButton() {

        klicken(LOESCHEN);
        assertEquals("", EINGABEFELD.getText());
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
