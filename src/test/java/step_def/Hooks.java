package step_def;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Hooks {

    public static WebDriver driver;
    public static WebDriverWait driverWait;

    @Before
    public void openBrowser() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");


        driver = new ChromeDriver(co);
        driverWait = new WebDriverWait(driver, 5);

        String appUrl = "";
        driver.get(appUrl);//fungsi untuk membuka link html
        driver.manage().window().maximize();//fungsi untuk memaximize browser
    }

    @After(order = 0)
    public void closeBrowser(){
        driver.quit();
    }

}
