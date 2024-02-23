package step_def;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.PageObject.CarRentalPage;
import org.example.PageObject.LoginPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CarRentalSteps {

    private WebDriver driver = Hooks.driver;
    private WebDriverWait driverWait = Hooks.driverWait;

    CarRentalPage carRentalPage = new CarRentalPage(driver);
    @Given("User open the website traveloka")
    public void userOpenTheWebsiteTraveloka() {
        Assert.assertTrue(carRentalPage.tvlLogo());
    }

    @When("User click car rental menu")
    public void userClickCarRentalMenu() {
        Assert.assertTrue(carRentalPage.carRentalTtl());
        carRentalPage.setuRentalLoct();
    }

    @Then("User click your rental location")
    public void userClickYourRentalLocation() {
    }

    @And("User choose Gambir Station")
    public void userChooseGambirStation() {
    }

    @Then("User select start date")
    public void userSelectStartDate() {
    }

    @And("User choose start time")
    public void userChooseStartTime() {
    }

    @Then("User select end date")
    public void userSelectEndDate() {
    }

    @And("User choose end time")
    public void userChooseEndTime() {
    }

    @And("User click search car")
    public void userClickSearchCar() {
    }

    @And("User select car")
    public void userSelectCar() {
    }
}
