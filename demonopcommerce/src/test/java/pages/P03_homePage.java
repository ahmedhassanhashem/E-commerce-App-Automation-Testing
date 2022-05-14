package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P03_homePage {

    WebDriver driver;

    public P03_homePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(className = "ico-register")
    public WebElement registerTab;

    @FindBy(className = "ico-login")
    public WebElement loginTab;

    @FindBy(className = "ico-account")
    public WebElement myAccountTab;

    @FindBy(id = "customerCurrency")
    public WebElement customerCurrency;

    @FindBy(xpath = "//div[@class=\"prices\"] //span")
    public WebElement productCurrency;

    @FindBy(id = "small-searchterms")
    public WebElement search;

    @FindBy(css = "button[type=\"submit\"]")
    public WebElement searchButton;

    @FindBy(id = "q")
    public WebElement searchKeyword;

    @FindBy(xpath = "//div [@class=\"header-menu\"]  //ul[@class]")
    public WebElement headerMenu;

    @FindBy(xpath = "//a[@href=\"/computers\"]")
    public WebElement menuComputers;

    @FindBy(xpath = "//a[@href=\"/software\"]")
    public WebElement submenuSoftware;

    @FindBy(xpath = "//*[@id=\"nivo-slider\"]/a[1]")
    public WebElement bannerNokia;

    @FindBy(xpath = "//*[@id=\"nivo-slider\"]/a[2]")
    public WebElement bannerIPhone;

    @FindBy(xpath = "//div[6]/div[3]/div/div/div/div/div[1]/div[2]/a[1]")
    public WebElement controllerNokia;

    @FindBy(xpath = "//div[6]/div[3]/div/div/div/div/div[1]/div[2]/a[2]")
    public WebElement controllerIPhone;

    @FindBy(linkText = "Facebook")
    public WebElement facebook;

    @FindBy(linkText = "Twitter")
    public WebElement twitter;

    @FindBy(linkText = "RSS")
    public WebElement rss;

    @FindBy(linkText = "YouTube")
    public WebElement youtube;

    @FindBy(xpath = "//div[@class=\"item-box\"][2]//div[@class=\"product-item\"]//div[@class=\"picture\"]")
    public WebElement macbookPicture;

    @FindBy(xpath = "//div[@id=\"bar-notification\"]//div")
    public WebElement successNotification;

    @FindBy(xpath = "//div[@id=\"bar-notification\"]//p")
    public WebElement successNotificationContent;

}