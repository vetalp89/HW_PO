package test.java.lesson7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class webSelector {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("start-maximized");
        WebDriver driver = new ChromeDriver(chromeOptions);

        driver.get("https://www.amazon.com/");

        Thread.sleep(1000);

        By byTodayDeal = By.xpath("//a[@data-csa-c-slot-id='nav_cs_0']");
        WebElement todayDeals = driver.findElement(byTodayDeal);
        todayDeals.click();
        Thread.sleep(1000);

        WebElement item = driver.findElement(By.xpath("//div[@id='100_dealView_3']"));
        item.click();
        Thread.sleep(1000);

        WebElement itemActive = driver.findElement(By.xpath("(//div[contains(@class,'a-section octopus-dlp-image-shield')])[1]"));
        itemActive.click();

        WebElement currentPrice = driver.findElement(By.xpath("//*[@id='priceblock_dealprice']"));
                WebElement oldprice = driver.findElement(By.xpath("//*[@id='price']//span[1]"));

        String currentPriceText = currentPrice.getText();
        String oldPriceText = oldprice.getText();

        System.out.printf("Deal of the day: %s, Price: %s", currentPriceText.substring(1),oldPriceText.substring(1));
        Thread.sleep(3000);
        driver.quit();
    }
}
