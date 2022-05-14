package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;
import pages.P03_homePage;
import pages.P04_productPage;

public class D09_ShoppingCartStepDef {

    @When("Click on ADD TO CART button")
    public void addCart() throws InterruptedException {
        P04_productPage P05 = new P04_productPage(Hooks.driver);
        P05.addCart.click();
        Hooks.rest();
        Thread.sleep(1000);
    }

    @Then("the product is added to the user's shopping cart and message appears says The product has been added to your shopping cart")
    public void cartAssertion(){
        P03_homePage P03 = new P03_homePage(Hooks.driver);
        SoftAssert wishlistAssertion = new SoftAssert();
        wishlistAssertion.assertEquals(P03.successNotificationContent.getText(),"The product has been added to your shopping cart");
        wishlistAssertion.assertEquals(P03.successNotification.getCssValue("background-color"), "rgba(75, 176, 122, 1)");
        wishlistAssertion.assertAll();
    }

}
