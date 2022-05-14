package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;
import pages.P03_homePage;

import java.time.Duration;

public class D06_homeSlidersStepDef {

    P03_homePage P03 = new P03_homePage(Hooks.driver);

    @Given("Click on Nokia banner controller")
    public void clickNokiaController(){
        P03.controllerNokia.click();
    }

    @When("Click on Nokia banner")
    public void clickNokiaBanner(){
        P03.bannerNokia.click();
        Hooks.rest();
    }

    @Then("User could click on the banner and redirect to the Nokia link")
    public void slidersAssertionNokia(){
        SoftAssert slidersAssertion = new SoftAssert();
        slidersAssertion.assertEquals(P03.bannerNokia.getAttribute("href"), "http://demo.nopcommerce.com/");
        slidersAssertion.assertAll();
    }

    @Given("Click on IPhone banner controller")
    public void clickIPhoneController(){
        P03.controllerIPhone.click();
    }

    @When("Click on IPhone banner")
    public void clickIPhoneBanner(){
        P03.bannerIPhone.click();
    }

    @Then("User could click on the banner and redirect to the IPhone link")
    public void slidersAssertionIPhone(){
        SoftAssert slidersAssertion = new SoftAssert();
        slidersAssertion.assertEquals(P03.bannerIPhone.getAttribute("href"), "http://demo.nopcommerce.com/");
        slidersAssertion.assertAll();
    }

}
