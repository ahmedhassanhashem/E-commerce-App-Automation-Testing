package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;
import pages.P03_homePage;

public class D03_currenciesStepDef {

    P03_homePage P03 = new P03_homePage(Hooks.driver);
    Select selector = new Select(P03.customerCurrency);
    String Currency;

    @Given("Look for products currency")
    public void lookProductsCurrency(){
        if (P03.productCurrency.getText().contains("$") == true)
            Currency = "US Dollar";
        else
            Currency = "Euro";
    }

    @When("Change the currency")
    public void changeCurrency(){
        if (Currency == "US Dollar") {
            selector.selectByVisibleText("Euro");
            Currency = "Euro";
        }else {
            selector.selectByVisibleText("US Dollar");
            Currency = "US Dollar";
        }
        Hooks.rest();
    }

    @Then("User could find the selected currency")
    public void currencyAssertion(){
        SoftAssert currencyAssertion = new SoftAssert();
        P03.customerCurrency = selector.getFirstSelectedOption();
        currencyAssertion.assertTrue(P03.customerCurrency.getText().contains(Currency));
        currencyAssertion.assertAll();
    }

}
