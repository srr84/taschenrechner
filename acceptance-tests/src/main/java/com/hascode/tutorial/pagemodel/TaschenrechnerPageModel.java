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
    WebElement buttonDot = null;

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
    
    public void clickNumber(int number) {
        
        WebElement current = getWebelementFromInt(number);
        click(current);
    }    

    public void clickButtonResult() {

        System.out.println("Bla");
        buttonResult = findElement(By.xpath("//input[@value='  =   ']"));
        System.out.println("Bla bla");
        buttonResult.click();
    }

    public void clickButtonPow() {

        buttonPow = findElement(By.xpath("//input[@value=' pow ']"));
        buttonPow.click();
    }

    public void clickButtonSqrt() {

        buttonSqrt = findElement(By.xpath("//input[@value='sqrt ']"));
        buttonSqrt.click();
    }

    public void clickButtonLn() {

        buttonSqrt = findElement(By.xpath("//input[@value=' ln ']"));
        buttonSqrt.click();
    }
    
    public void clickButtonDot() {

        buttonDot = findElement(By.xpath("//input[@value='  .   ']"));
        buttonDot.click();
    }

    public void checkResult(String expectedResult) {

        assertEquals(expectedResult, getInputFieldValue());
    }

    private WebElement getWebelementFromInt(int wert) {

        switch (wert) {
            case 0:
                WebElement buttonZero = findElement(By.xpath("//input[@value='  0   ']"));
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
