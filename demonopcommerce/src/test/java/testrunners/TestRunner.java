package testrunners;



import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


//@RunWith(Cucumber.class)

@CucumberOptions(
        features = "src\\main\\resources\\features",
        glue = {"stepdefinitions"},
        plugin = {"pretty", "html:target/cucumber"},
        tags = "@SmokeTesting"

)

public class TestRunner extends AbstractTestNGCucumberTests {
}
