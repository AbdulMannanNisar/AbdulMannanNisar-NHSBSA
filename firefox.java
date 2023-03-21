package stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static stepdefs.functions.functions.Know_the_treatment;
import static stepdefs.functions.functions.Options;

public class firefox {

    WebDriver driver = new FirefoxDriver();

    @Given("I am a citizen of UK")
    public void setup(){
        WebDriverManager.firefoxdriver().setup();


        driver.get("https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/start");
        String Expected_Title = "Check what help you could get to pay for NHS costs - NHSBSA";
        String Actual_Title  = driver.getTitle();
        Assert.assertEquals(Actual_Title,Expected_Title);

    }

    @When("I put my circumstances into Checker tool")
    public void Select_Options() {
        Options(driver);

    }
    @Then("I should get result of whether I will get help or not")
    public void KnowTheTreatment() {
        Know_the_treatment(driver);

    }

}