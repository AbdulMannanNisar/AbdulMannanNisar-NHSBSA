package stepdefs;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

//import cucumber.api.CucumberOptions;
//import cucumber.api.junit.Cucumber;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/stepdefs/scenarios.feature"},
        glue = {"stepdefs"},
        plugin = {"json:target/cucumber.json"}) //report
public class TestRunner {


}