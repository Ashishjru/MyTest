package CucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = "src/test/java/features",glue = "stepDefinitions",monochrome = true,tags = "@SearchProduct",
plugin = {"pretty","html:target/Cucumber.html"})

public class TestNGTestRunner extends AbstractTestNGCucumberTests {
}
