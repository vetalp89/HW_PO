package test.java.lesson8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import static org.testng.Assert.assertEquals;

public class AmazonWaitsTest {
    By signInBy = By.id("nav-link-accountList");
    By createAccountBy = By.id("createAccountSubmit");
    By continueBy = By.id("continue");
    By customerNameBy = By.id("ap_customer_name");
    By customerEmailBy = By.id("ap_email");
    By customerPasswordBy = By.id("ap_password");
    WebDriver driver;

    @BeforeMethod
    public void initializeBrowser(){
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        //driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        chromeOptions.addArguments("start-maximized");
        driver = new ChromeDriver(chromeOptions);
    }

    @Test
    public void test1() throws InterruptedException {
        driver.get("https://www.amazon.com/");
        driver.findElement(signInBy).click();
        driver.findElement(createAccountBy).click();
        driver.findElement(continueBy).click();
        driver.findElement(customerNameBy).click();
        String nameExpectedColor = "rgb(221, 0, 0)";
        String nameActualColor = driver.findElement(customerNameBy).getCssValue("border-color");
        assertEquals(nameActualColor, nameExpectedColor);

      //  driver.findElement(customerEmailBy).click();
        String emailExpectedColor = "rgb(221, 0, 0)";
        String emailActualColor = driver.findElement(customerEmailBy).getCssValue("border-color");
        assertEquals(emailActualColor, emailExpectedColor);

       // driver.findElement(customerPasswordBy).click();
        String passwordExpectedColor = "rgb(221, 0, 0)";
        String passwordActualColor = driver.findElement(customerPasswordBy).getCssValue("border-color");
        assertEquals(passwordActualColor, passwordExpectedColor);

    }

        @AfterMethod
    public void finilizeBrowser(){
      //  driver.quit();
    }
}
