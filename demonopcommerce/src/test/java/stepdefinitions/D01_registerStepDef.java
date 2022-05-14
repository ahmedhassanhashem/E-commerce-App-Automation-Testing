package stepdefinitions;


import org.testng.asserts.SoftAssert;
import pages.P01_register;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.P03_homePage;


public class D01_registerStepDef {

    P01_register P01 = new P01_register(Hooks.driver);

    @Given("Click on Register tab")
    public void clickRegisterTab(){
        P03_homePage P03 = new P03_homePage(Hooks.driver);
        P03.registerTab.click();
    }

    @When("Click on any radio button to chose gender")
    public void choseGender(){
        P01.gender.click();
    }

    @And("User enter First name and Last name")
    public void fillName(){
        P01.firstName.sendKeys("Gherkin");
        P01.lastName.sendKeys("Cucumber");
    }

    @And("User Select Date of Birth: Select [Day, Month, Year]")
    public void pickDate(){
        P01.dobDay.click();
        P01.dobMonth.click();
        P01.dobYear.click();
    }

    @And("^User enter email: \"(.*)\"$")
    public void fillEmail(String email){
        P01.email.sendKeys(email);
    }

    @And("Fill Company name")
    public void fillCompanyName(){
        P01.company.sendKeys("Selenium");
    }

    @And("^User enter Password and Confirm it: \"(.*)\"$")
    public void fillPassword(String password){
        P01.password.sendKeys(password);
        P01.confirmPassword.sendKeys(password);
    }

    @And("Click on REGISTER button")
    public void clickRegisterButton(){
        P01.registerButton.click();
        Hooks.rest();
    }

    @Then("User could register successfully")
    public void RegistrationAssertion(){
        SoftAssert registrationAssertion = new SoftAssert();
        registrationAssertion.assertTrue(P01.registrationComplete.getText().contains("Your registration completed"));
        registrationAssertion.assertEquals(P01.registrationComplete.getCssValue("color"), "rgba(76, 177, 124, 1)");
        registrationAssertion.assertAll();
    }

    @And("Click on CONTINUE button")
    public void clickContinue(){
        P01.continueButton.click();
        Hooks.rest();
    }

}
