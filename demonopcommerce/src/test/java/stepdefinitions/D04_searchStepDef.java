package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;
import pages.P03_homePage;

public class D04_searchStepDef {

    P03_homePage P03 = new P03_homePage(Hooks.driver);
    String searchedProduct;

    @Given("^Type \"(.*)\" on search text box$")
    public void searchProduct(String product){
        P03.search.sendKeys(product);
        searchedProduct = product;
    }

    @When("Click on SEARCH button or hit enter key")
    public void clickSearch(){
        P03.searchButton.click();
        Hooks.rest();
    }

    @Then("User could find Apple products")
    public void searchAssertion(){
        SoftAssert searchAssertion = new SoftAssert();
        searchAssertion.assertEquals(P03.searchKeyword.getAttribute("value"),searchedProduct);
        searchAssertion.assertAll();
    }

    @Then("User could find Apple product")
    public void skuSearchAssertion(){
        SoftAssert searchAssertion = new SoftAssert();
        searchAssertion.assertEquals(P03.searchKeyword.getAttribute("value"),searchedProduct);
        searchAssertion.assertAll();
    }



}
