package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;
import pages.P03_homePage;
import pages.P04_productPage;

public class D08_WishlistStepDef {

    @When("Click on add to wishlist icon")
    public void addProduct() throws InterruptedException {
        P04_productPage P04 = new P04_productPage(Hooks.driver);
        P04.wishListIcon.click();
        Hooks.rest();
        Thread.sleep(1000);
    }

    @Then("the product is added to the user's wishlist and message appears says The product has been added to your wishlist")
    public void wishlistAssertion(){
        P03_homePage P03 = new P03_homePage(Hooks.driver);
        SoftAssert wishlistAssertion = new SoftAssert();
        wishlistAssertion.assertEquals(P03.successNotificationContent.getText(),"The product has been added to your wishlist");
        wishlistAssertion.assertEquals(P03.successNotification.getCssValue("background-color"), "rgba(75, 176, 122, 1)");
        wishlistAssertion.assertAll();
    }

}
