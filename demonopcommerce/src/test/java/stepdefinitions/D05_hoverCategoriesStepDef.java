package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;
import pages.P03_homePage;

public class D05_hoverCategoriesStepDef {

    P03_homePage P03 = new P03_homePage(Hooks.driver);
    Actions hover = new Actions(Hooks.driver);

    @Given("Hover the header menu and select random category then hover it")
        public void hoverHeader() {
        hover.moveToElement(P03.headerMenu).perform();
        Hooks.rest();
        hover.moveToElement(P03.menuComputers).perform();
        Hooks.rest();
        }

    @When("Click on random sub-category if found")
    public void clickSubCategory() {
        hover.moveToElement(P03.submenuSoftware);
        Hooks.rest();
        hover.click().build().perform();
        Hooks.rest();
    }

    @Then("User could open sub-category page")
    public void hoverAssertion(){
        SoftAssert registrationAssertion = new SoftAssert();
        registrationAssertion.assertEquals(Hooks.driver.getCurrentUrl(), "https://demo.nopcommerce.com/software");
        registrationAssertion.assertAll();

    }



}
