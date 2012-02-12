package com.hascode.tutorial.steps;

import com.hascode.tutorial.pagemodel.Pages;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.web.selenium.SeleniumSteps;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class TaschenrechnerSteps extends SeleniumSteps {
    
    private final Pages pages;

    public TaschenrechnerSteps(Pages pages) {
        this.pages = pages;
    }

    @Given("the calculator is in default state")
    public void openCalculator() {
        pages.setup().open();
    }

    @Given("the calculator has $values inside the input field")
    public void openCalculatorWithValues(String values) {
        openCalculator();
        pages.taschenrechner().input(values);
    }

    @Given("a $value is shown")
    public void addValue(String value) {
        pages.taschenrechner().input(value);
    }

    @When("the user clicks number $number Button")
    public void clickNumber(int number) {
        pages.taschenrechner().clickNumber(number);
    }

    @When("the user presses $key")
    public void pressKey(String key) {
        pages.taschenrechner().input(key);
    }

    @When("the user clicks = Button")
    public void clickResult() {
        pages.taschenrechner().clickButtonResult();
    }

    @When("the user clicks pow Button")
    public void clickPow() {
        pages.taschenrechner().clickButtonPow();
    }

    @When("the user clicks sqrt Button")
    public void clickSqrt() {
        pages.taschenrechner().clickButtonSqrt();
    }

    @When("the user clicks ln Button")
    public void clickLn() {
        pages.taschenrechner().clickButtonLn();
    }

    @When("the user clicks dot Button")
    public void clickDot() {
        pages.taschenrechner().clickButtonDot();
    }

    @When("C is clicked")
    public void delete() {
        pages.taschenrechner().deleteInputWithCButton();
    }

    @Then("the result is $result")
    public void verifyInputFieldValue(String result) {

        pages.taschenrechner().checkResult(result);
    }

    @Then("the input field is empty")
    public void verifyEmptyInputFieldValue() {

        pages.taschenrechner().checkResult("");
    }
}
