package inecoBank;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

import static util.BaseDriver.getDriver;
import static util.BaseDriver.setDriver;

public class BaseTest {
    protected WebDriver driver;

    @BeforeMethod
    public void setUp() {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver(110).exe");
        driver = getDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @AfterMethod
    public void tearDown() {
        if(driver != null) {
            driver.quit();
            setDriver(null);
        }
    }

}
