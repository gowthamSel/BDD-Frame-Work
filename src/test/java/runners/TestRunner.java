package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(glue = "stepDefinitions",
        features = "src/test/resources/features",
        tags ="@sampleStepWithRegEx",
        plugin = "pretty")
public class TestRunner extends AbstractTestNGCucumberTests {

}
