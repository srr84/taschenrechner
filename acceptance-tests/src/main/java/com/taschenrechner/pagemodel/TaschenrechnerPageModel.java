package com.hascode.tutorial.pagemodel;

import org.jbehave.web.selenium.WebDriverProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static junit.framework.Assert.assertEquals;

/**
 * Created by IntelliJ IDEA.
 * User: svenruchti
 * Date: 12.02.12
 * Time: 16:54
 * To change this template use File | Settings | File Templates.
 */
public class TaschenrechnerPageModel extends AbstractPage {

    public TaschenrechnerPageModel(WebDriverProvider driverProvider) {
        super(driverProvider);
    }

    //Webelements
    WebElement inputField = null;
    WebElement buttonZero = null;
    WebElement buttonOne = null;
    WebElement buttonTwo = null;
    WebElement buttonThree = null;
    WebElement buttonFour = null;
    WebElement buttonFive = null;
    WebElement buttonSix = null;
    WebElement buttonSeven = null;
    WebElement buttonEight = null;
    WebElement buttonNine = null;
    WebElement buttonPlus = null;
    WebElement buttonMinus = null;
    WebElement buttonMultiply = null;
    WebElement buttonDivide = null;
    WebElement buttonPow = null;
    WebElement buttonSqrt = null;
    WebElement buttonLog = null;
    WebElement buttonResult = null;
    WebElement buttonDelete = null;
    
    /*WebElement NULL = findElement(By.xpath("//input[@value='  0   ']"));
    WebElement EINS = findElement(By.xpath("//input[@value='  1   ']"));
    WebElement ZWEI = findElement(By.xpath("//input[@value='  2   ']"));
    WebElement DREI = findElement(By.xpath("//input[@value='  3   ']"));
    WebElement VIER = findElement(By.xpath("//input[@value='  4   ']"));
    WebElement FUENF = findElement(By.xpath("//input[@value='  5   ']"));
    WebElement SECHS = findElement(By.xpath("//input[@value='  6   ']"));
    WebElement SIEBEN = findElement(By.xpath("//input[@value='  7   ']"));
    WebElement ACHT = findElement(By.xpath("//input[@value='  8   ']"));
    WebElement NEUN = findElement(By.xpath("//input[@value='  9   ']"));
    WebElement PUNKT = findElement(By.xpath("//input[@value='  .   ']"));
    WebElement PLUS = findElement(By.xpath("//input[@value='  +   ']"));
    WebElement MINUS = findElement(By.xpath("//input[@value='  -   ']"));
    WebElement MULTI = findElement(By.xpath("//input[@value='  *   ']"));
    WebElement DIVISION = findElement(By.xpath("//input[@value='  /   ']"));
    WebElement WURZEL = findElement(By.xpath("//input[@value='sqrt ']"));
    WebElement LOESCHEN = findElement(By.xpath("//input[@value='  C  ']"));
    WebElement LOGARITHMUS = findElement(By.xpath("//input[@value=' ln ']"));
    WebElement QUADRAT = findElement(By.xpath("//input[@value=' pow ']"));
    WebElement inputField = findElement(By.name("Display"));
    WebElement buttonResult = findElement(By.xpath("//input[@value='  =   ']"));*/


    public void input(String value) {

        inputField = findElement(By.name("Display"));
        inputField.sendKeys(value);
    }

    public void deleteInput() {

        inputField = findElement(By.name("Display"));
        inputField.clear();
    }
    
    public String getInputFieldValue() {

        inputField = findElement(By.name("Display"));
        String value = inputField.getAttribute("value");
        return value;
    }

    public void deleteInputWithCButton() {

        buttonDelete = findElement(By.xpath("//input[@value='  C  ']"));
        buttonDelete.click();
    }

    public void click(WebElement taste) {

        taste.click();
    }
    
    public void clickNumber(int zahl) {
        
        WebElement current = getWebelementFromInt(zahl);
        click(current);
    }    

    public void clickButtonResult() {

        buttonResult.click();
    }

    public void checkResult(String expectedResult) {

        assertEquals(expectedResult, getInputFieldValue());
    }


    /*public void addierenMitButton(int ersteZahl, int zweiteZahl, int buttonResult) {

        klicken(getWebelementFromInt(ersteZahl));
        klicken(PLUS);
        klicken(getWebelementFromInt(zweiteZahl));
        klicken(buttonResult);
        checkResult("" + buttonResult);
    }

    public void addierenMitTastatur(int ersteZahl, int zweiteZahl, int buttonResult) {

        eingeben("" + ersteZahl);
        eingeben("+");
        eingeben("" + zweiteZahl);
        klicken(buttonResult);
        checkResult("" + buttonResult);
    }

    public void subtrahierenMitButton(int ersteZahl, int zweiteZahl, int buttonResult) {

        klicken(getWebelementFromInt(ersteZahl));
        klicken(MINUS);
        klicken(getWebelementFromInt(zweiteZahl));
        klicken(buttonResult);
        checkResult("" + buttonResult);
    }

    public void subtrahierenMitTastatur(int ersteZahl, int zweiteZahl, int buttonResult) {

        eingeben("" + ersteZahl);
        eingeben("-");
        eingeben("" + zweiteZahl);
        klicken(buttonResult);
        checkResult("" + buttonResult);
    }


    public void multiplizierenMitButton(int ersteZahl, int zweiteZahl, int buttonResult) {

        klicken(getWebelementFromInt(ersteZahl));
        klicken(MULTI);
        klicken(getWebelementFromInt(zweiteZahl));
        klicken(buttonResult);
        checkResult("" + buttonResult);
    }

    public void multiplizierenMitTastatur(int ersteZahl, int zweiteZahl, int buttonResult) {

        eingeben("" + ersteZahl);
        eingeben("*");
        eingeben("" + zweiteZahl);
        klicken(buttonResult);
        checkResult("" + buttonResult);
    }

    public void dividierenMitButton(int ersteZahl, int zweiteZahl, int buttonResult) {

        klicken(getWebelementFromInt(ersteZahl));
        klicken(DIVISION);
        klicken(getWebelementFromInt(zweiteZahl));
        klicken(buttonResult);
        checkResult("" + buttonResult);
    }

    public void dividierenMitTastatur(int ersteZahl, int zweiteZahl, int buttonResult) {

        eingeben("" + ersteZahl);
        eingeben("/");
        eingeben("" + zweiteZahl);
        klicken(buttonResult);
        checkResult("" + buttonResult);
    }

    public void quadrierenMitButton(int zahl, int buttonResult) {

        klicken(getWebelementFromInt(zahl));
        klicken(QUADRAT);
        klicken(buttonResult);
        checkResult("" + buttonResult);
    }


    public void wurzelMitButton(int zahl, int buttonResult) {

        klicken(getWebelementFromInt(zahl));
        klicken(WURZEL);
        klicken(buttonResult);
        checkResult("" + buttonResult);
    }


    public void logarithmusMitButton(int zahl, int buttonResult) {

        klicken(getWebelementFromInt(zahl));
        klicken(LOGARITHMUS);
        klicken(buttonResult);
        checkResult("" + buttonResult);
    }


    public void löschenMitButton() {

        klicken(buttoDelete);
        assertEquals("", inputField.getAttribute("value"));
    }

    */
    private WebElement getWebelementFromInt(int wert) {

        switch (wert) {
            case 0:
                WebElement buttonZero = findElement(By.xpath("//input[@value='  1   ']"));
                return buttonZero;
            case 1:
                WebElement buttonOne = findElement(By.xpath("//input[@value='  1   ']"));
                return buttonOne;
            case 2:
                WebElement buttonTwo = findElement(By.xpath("//input[@value='  2   ']"));
                return buttonTwo;
            case 3:
                WebElement buttonThree = findElement(By.xpath("//input[@value='  3   ']"));
                return buttonThree;
            case 4:
                WebElement buttonFour = findElement(By.xpath("//input[@value='  4   ']"));
                return buttonFour;
            case 5:
                WebElement buttonFive = findElement(By.xpath("//input[@value='  5   ']"));
                return buttonFive;
            case 6:
                WebElement buttonSix = findElement(By.xpath("//input[@value='  6   ']"));
                return buttonSix;
            case 7:
                WebElement buttonSeven = findElement(By.xpath("//input[@value='  7   ']"));
                return buttonSeven;
            case 8:
                WebElement buttonEight = findElement(By.xpath("//input[@value='  8   ']"));
                return buttonEight;
            case 9:
                WebElement buttonNine = findElement(By.xpath("//input[@value='  9   ']"));
                return buttonNine;
        }
        return null;
    }

}
