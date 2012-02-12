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

    @When("a $number is clicked")
    public void clickNumber(int number) {
        pages.taschenrechner().clickNumber(number);
    }

    @When("a $key is pressed")
    public void pressKey(String key) {
        pages.taschenrechner().input(key);
    }
    
    @When("C is clicked")
    public void delete() {
        pages.taschenrechner().deleteInputWithCButton();
    }

    @Then("$result is shown inside the input field")
    public void verifyInputFieldValue(String result) {

        pages.taschenrechner().checkResult(result);
    }

    @Then("the input field is empty")
    public void verifyEmptyInputFieldValue() {

        pages.taschenrechner().checkResult("");
    }
}
