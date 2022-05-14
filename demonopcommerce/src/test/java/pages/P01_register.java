package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class P01_register {
    WebDriver driver;

    public P01_register(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "// input[@type=\"radio\"]")
    public WebElement gender;

    @FindBy(id = "FirstName")
    public WebElement firstName;

    @FindBy(id = "LastName")
    public WebElement lastName;

    @FindBy(xpath = "//select[@name=\"DateOfBirthDay\"]  //option [@value=\"20\"]")
    public WebElement dobDay;

    @FindBy(xpath = "//select[@name=\"DateOfBirthMonth\"]  //option [@value=\"2\"]")
    public WebElement dobMonth;

    @FindBy(xpath = "//select[@name=\"DateOfBirthYear\"]  //option [@value=\"2000\"]")
    public WebElement dobYear;

    @FindBy(id = "Email")
    public WebElement email;

    @FindBy(id = "Company")
    public WebElement company;

    @FindBy(id = "Password")
    public WebElement password;

    @FindBy(id = "ConfirmPassword")
    public WebElement confirmPassword;

    @FindBy(id = "register-button")
    public WebElement registerButton;

    @FindBy(className = "result")
    public WebElement registrationComplete;

    @FindBy(xpath = "//div [@class=\"buttons\"] //a[@href=\"/\"]")
    public WebElement continueButton;

}
