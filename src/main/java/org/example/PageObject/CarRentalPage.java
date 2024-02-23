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
    @FindBy(xpath = "//div[@class='css-1dbjc4n r-14lw9ot r-1wh2hl7 r-e65k4z r-b4qz5r r-1d2f490 r-1udh08x r-u8s1d']//div[@class='css-1dbjc4n r-1awozwy r-1vjbqqu r-1naam9t r-sdzlij r-d045u9 r-eqz5dr r-16y2uox r-1472mwg r-1777fci r-1wyvozj r-1pn2ns4 r-u8s1d r-70iriu r-136ojw6']")
    public static WebElement startDateForRent;
    @FindBy(xpath = "//div[@class='css-1dbjc4n r-18u37iz r-xyw6el']//div[@class='css-1dbjc4n r-391gc0 r-1loqt21 r-1777fci r-tuq35u r-1otgn73 r-1i6wzkk r-lrvibr']/div[.='9']")
    public static WebElement startTimeForRent;
    @FindBy(xpath = "//input[@value='27 February 2024']")
    public static WebElement endDateBar;
    @FindBy(xpath = "//input[@value='27 February 2024']")
    public static WebElement endDateForRent;
    @FindBy(xpath = "//div[@class='css-1dbjc4n r-obd0qt r-18u37iz r-1h0z5md']/div[7]//input[@class='css-11aywtz r-z2wwpe r-t1w4ow r-1b43r93 r-majxgm r-mabqd8 r-rjixqe r-cwlir5']")
    public static WebElement endTime;
    @FindBy(xpath = "//div[@class='css-1dbjc4n r-14lw9ot r-1wh2hl7 r-e65k4z r-b4qz5r r-1udh08x r-u8s1d r-zchlnj']//div[@class='css-1dbjc4n r-1awozwy r-1vjbqqu r-1naam9t r-sdzlij r-d045u9 r-eqz5dr r-16y2uox r-1472mwg r-1777fci r-1wyvozj r-1pn2ns4 r-u8s1d r-70iriu r-136ojw6']")
    public static WebElement endTimeForRent;
    @FindBy(xpath = "//div[@class='css-18t94o4 css-1dbjc4n r-kdyh1x r-1loqt21 r-10paoce r-1e081e0 r-5njf8e r-1otgn73 r-lrvibr']")
    public static WebElement searchBtn;
    @FindBy(xpath = "//h2[.='Car Rental Without Driver']")
    public static WebElement carRentWithoutDriver;
    @FindBy(xpath = "//div[.='ProviderProvider']")
    public static WebElement carProviderBtn;
    @FindBy(xpath = "//div[@class='css-1dbjc4n r-150rngu r-eqz5dr r-16y2uox r-1wbh5a2 r-1s2bzr4 r-1pxuy4t r-11yh6sk r-1rnoaur r-1sncvnh']//div[@class='css-1dbjc4n r-iphfwy']/div[.='Smart Rent Car Driverless Jakarta9.7']")
    public static WebElement carProvideOption;
    @FindBy(xpath = "//div[@class='css-1dbjc4n r-1ihkh82 r-1q2s4rl r-ttdzmv']/div[@class='css-1dbjc4n r-150rngu r-eqz5dr r-16y2uox r-1wbh5a2 r-11yh6sk r-1rnoaur r-1sncvnh']/div[@class='css-1dbjc4n']/div[1]//div[@class='css-18t94o4 css-1dbjc4n r-kdyh1x r-1loqt21 r-10paoce r-1e081e0 r-5njf8e r-1otgn73 r-lrvibr']")
    public static WebElement continueBtn;
    @FindBy(xpath = "//div[@class='css-1dbjc4n r-1awozwy r-1naam9t r-16uyjmq r-rs99b7 r-18yzcnr r-1777fci r-yc9v9c']/div[@class='css-1dbjc4n r-1naam9t r-1fuqb1j r-d045u9 r-1472mwg r-orgf3d r-u8s1d r-lrsllp']")
    public static WebElement pickUpLoct;
    @FindBy(xpath = "//div[@class='css-1dbjc4n r-14lw9ot r-kdyh1x r-b4qz5r r-1ifxtd0 r-nsbfu8 r-184en5c']//div[@class='css-1dbjc4n r-1awozwy r-1naam9t r-16uyjmq r-rs99b7 r-18yzcnr r-1777fci r-yc9v9c']/div[@class='css-1dbjc4n r-1naam9t r-1fuqb1j r-d045u9 r-1472mwg r-orgf3d r-u8s1d r-lrsllp']")
    public static WebElement dropOffLoct;
    @FindBy(xpath = "//div[@class='css-1dbjc4n r-1vjbqqu r-1q52ik8 r-qklmqi r-fu27ei r-rs99b7 r-1loqt21 r-kzbkwu r-1otgn73 r-1i6wzkk r-lrvibr']//div[@class='css-1dbjc4n r-13awgt0']")
    public static WebElement pickUpLocationPlace;
    @FindBy(xpath = "//div[@class='css-1dbjc4n r-1vjbqqu r-1q52ik8 r-qklmqi r-fu27ei r-rs99b7 r-1loqt21 r-kzbkwu r-1otgn73 r-1i6wzkk r-lrvibr']//div[@class='css-1dbjc4n r-13awgt0']")
    public static WebElement dropOffLocationPlace;
    @FindBy(xpath = "//div[@class='css-18t94o4 css-1dbjc4n r-kdyh1x r-1loqt21 r-10paoce r-5wp0in r-5njf8e r-1otgn73 r-lrvibr']")
    public static WebElement continueBtnProductDetail;
    @FindBy(xpath = "//h3[.='Contact Details (for E-ticket/Voucher)']")
    public static WebElement contactDetailTitle;
    @FindBy(xpath = "//div[@class='css-1dbjc4n r-tzxfm6']/div[@class='css-1dbjc4n']//div[@class='css-1dbjc4n r-mhe3cw']//div[@class='css-1dbjc4n r-14lw9ot r-kdyh1x r-rs99b7 r-1p0dtai r-1d2f490 r-u8s1d r-zchlnj r-ipm5af r-1wyyakw']")
    public static WebElement fullNameContDet;


    @FindBy(xpath = "//div[.='ProviderProvider']")
    public static WebElement aaa;

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
    public void setuRentalLoctJak(String loctJak) {
        uRentalLoction.sendKeys(loctJak);
    }
    public void setuRentalLoct() {
        uRentalLoction.click();
    }
    public void clickYourRentLoct(String usrName) {
        uRentalLoction.sendKeys(usrName);
    }
    public void setGambirStation() {
        gambirStation.click();
    }
    public void setDateForRent() {
        startDateForRent.click();
    }
    public void setTimeForRent() {
        startTimeForRent.click();
    }
    public void setEndDateForRent() {
        endDateForRent.click();
    }
    public void setEndTimeForRent() {
        endTimeForRent.click();
    }
    public void setSearchBtn() {
        searchBtn.click();
    }
    public boolean carRentResultTitle() {
        return carRentWithoutDriver.isDisplayed();
    }
    public void setCarProviderBtn() {
        carProviderBtn.click();
    }
    public void setCarProvideOption() {
        carProvideOption.click();
    }
    public void setContinueBtn() {
        continueBtn.click();
    }
    public boolean pickUpLoctRadioBtn() {
        return pickUpLoct.isDisplayed();
    }
    public void setPickUpLoct() {
        pickUpLoct.click();
    }
    public void setPickUpLocationPlace() {
        pickUpLocationPlace.click();
    }
    public void setDropOffLoct() {
        dropOffLoct.click();
    }
    public void setContinueBtnProductDetail() {
        continueBtnProductDetail.click();
    }
    public boolean contDetailTitle() {
        return contactDetailTitle.isDisplayed();
    }
    public void setFullNameContDet() {
        fullNameContDet.click();
    }
}
