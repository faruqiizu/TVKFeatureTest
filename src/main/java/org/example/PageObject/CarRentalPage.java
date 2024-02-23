package org.example.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CarRentalPage {
    public static WebDriver webDriver;

    public CarRentalPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }

    @FindBy(xpath = "//img[@src='https://d1785e74lyxkqq.cloudfront.net/_next/static/v2/9/97f3e7a54e9c6987283b78e016664776.svg']")
    public static WebElement travelokaLogo;
    @FindBy(xpath = "//h4[.='Car Rental']")
    public static WebElement carRentalMenu;
    @FindBy(xpath = "//div[@class='css-1dbjc4n r-n0o8ka r-1ufr4wv']//input[@class='css-11aywtz r-z2wwpe r-t1w4ow r-1b43r93 r-majxgm r-mabqd8 r-rjixqe r-cwlir5']")
    public static WebElement uRentalLoction;
    @FindBy(xpath = "//div[@class='css-1dbjc4n r-150rngu r-eqz5dr r-16y2uox r-1wbh5a2 r-11yh6sk r-1rnoaur r-1sncvnh']/div[@class='css-1dbjc4n']/div[@class='css-1dbjc4n']/div[contains(.,'Gambir StationGambir, Central Jakarta, Jakarta, Indonesia, Southeast Asia, AsiaT')]")
    public static WebElement gambirStation;
    @FindBy(xpath = "//h3[.='Car Rental']")
    public static WebElement carRentalTitle;

    //------------------------------------------------
    public boolean tvlLogo() {
        return travelokaLogo.isDisplayed();
    }
    public boolean carRentalTtl() {
        return carRentalTitle.isDisplayed();
    }
    public void setCarRentalMenu() {
        carRentalMenu.click();
    }
    public void setuRentalLoct() {
        uRentalLoction.click();
    }
    public void setGambirStation() {
        gambirStation.click();
    }

}
