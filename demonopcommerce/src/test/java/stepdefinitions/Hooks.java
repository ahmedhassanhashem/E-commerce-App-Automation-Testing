package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import pages.P01_register;
import pages.P03_homePage;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Hooks {

    public static WebDriver driver = null;

    public static void rest(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @Before
    public void openBrowser(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
        rest();
    }

    @After
    public void closeBrowser(){
        driver.quit();
    }

    @Given("Scroll down and choose a random product and click on it")
    public void chooseProduct() throws InterruptedException {
        Actions action = new Actions(Hooks.driver);
        action.sendKeys(Keys.chord(Keys.PAGE_DOWN,Keys.PAGE_DOWN));
        Thread.sleep(1000);
        P03_homePage P03 = new P03_homePage(Hooks.driver);
        P03.macbookPicture.click();
        Hooks.rest();
    }

}
