import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.PageObject.CarRentalPage;
import org.example.PageObject.LoginPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import step_def.Hooks;

public class CarRentalSteps {

    private WebDriver driver = Hooks.driver;
    private WebDriverWait driverWait = Hooks.driverWait;

    CarRentalPage carRentalPage = new CarRentalPage(driver);
    @Given("User Open The Website Traveloka")
    public void userOpenTheWebsiteTraveloka() {
        Assert.assertTrue(carRentalPage.tvlLogo());
    }

    @When("User Click Car Rental Menu")
    public void userClickCarRentalMenu() {
    carRentalPage.setCarRentalMenu();
    }

    @Then("User Select Pick-up Location {string}")
    public void userSelectPickUpLocation(String Location) {
    carRentalPage.setuRentalLoctJak(Location);
    }

    @And("User Select Pick-up Date & Time Asfollows")
    public void userSelectPickUpDateTimeAsfollows() {
    carRentalPage.setDateForRent();
    carRentalPage.setTimeForRent();
    }

    @And("User Select Drop-off Date & Time Asfollows")
    public void userSelectDropOffDateTimeAsfollows() {
        carRentalPage.setEndDateForRent();
        carRentalPage.setEndTimeForRent();
    }

    @Then("User Click button Search Car")
    public void userClickButtonSearchCar() {
        carRentalPage.setSearchBtn();
    }

    @And("User Select Car")
    public void userSelectCar() {
        Assert.assertTrue(carRentalPage.carRentResultTitle());
    }

    @And("User Select Car Provider")
    public void userSelectCarProvider() {
        carRentalPage.setCarProviderBtn();
        carRentalPage.setCarProvideOption();
    }

    @Then("User Click button Continue in Product Detail")
    public void userClickButtonContinueInProductDetail() {
        carRentalPage.setContinueBtn();
    }

    @And("User Select Pick-up Location in “Rental Office”")
    public void userSelectPickUpLocationInRentalOffice() {
    }

    @And("User Select Drop-off Location in “Other Location”")
    public void userSelectDropOffLocationInOtherLocation() {
    }

    @And("User Input Pick-up or Drop-off notes is optional")
    public void userInputPickUpDropOffNotesIsOptional() {
    }

    @Then("User Click button Book Now")
    public void userClickButtonBookNow() {
    }

    @And("User Fill Contact Details")
    public void userFillContactDetails() {
    }

    @And("User Fill Driver Details")
    public void userFillDriverDetails() {
    }

    @Then("User Click Continue")
    public void userClickContinue() {
    }

    @And("User Add a special request is optional")
    public void userAddASpecialRequestIsOptional() {
    }

    @And("User Check all rental requirements")
    public void userCheckAllRentalRequirements() {
    }

    @And("User Select payment method and proceed payment")
    public void userSelectPaymentMethodAndProceedPayment() {
    }
}
