package test.java.lesson8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class AmazonWaitsTest3 {
    By searchFieldBy = By.id("twotabsearchtextbox");
    Robot robot;
    By searchProductsBy = By.xpath("//div[@class='a-section a-spacing-medium']");
    WebDriver driver;
    WebDriverWait wait;

    @BeforeMethod
    public void initializeBrowser() throws AWTException {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
       // driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        chromeOptions.addArguments("start-maximized");
        driver = new ChromeDriver(chromeOptions);
       // wait = new WebDriverWait(driver, 10, 500);
        robot = new Robot();

    }

    @Test
    public void test1() throws InterruptedException {
        driver.get("https://www.amazon.com/");
        driver.findElement(searchFieldBy).sendKeys("iPhone");
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease((KeyEvent.VK_ENTER));

        List<WebElement> searchProducts = driver.findElements(searchProductsBy);
        for (WebElement el: searchProducts) {
            el.getText().contains("iPhone");
        }

        String expectedProduct = "iPhone";
        List<WebElement> actualProduct = searchProducts;
        assertEquals(actualProduct, expectedProduct);
    }

    @Test
    public void test2() throws InterruptedException {
        driver.get("https://www.amazon.com/");
        driver.findElement(searchFieldBy).sendKeys("Samsung");
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease((KeyEvent.VK_ENTER));

        List<WebElement> searchProducts = driver.findElements(searchProductsBy);
        for (WebElement el: searchProducts) {
            el.getText().contains("Samsung");
        }

        String expectedProduct = "Samsung";
        List<WebElement> actualProduct = searchProducts;
        assertEquals(actualProduct, expectedProduct);
    }



    @AfterMethod
    public void finilizeBrowser(){
      //  driver.quit();
    }
}
