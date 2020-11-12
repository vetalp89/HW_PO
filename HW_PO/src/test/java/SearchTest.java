package test.java;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.List;

public class SearchTest extends TestBaseSetup {
    WebDriver driver;
    WebDriverWait wait;
    By searchFieldBy = By.id("twotabsearchtextbox");
    By nameOfProductBy = By.xpath("//span[@class=\"a-size-medium a-color-base a-text-normal\"]");

    @Test
    public void IPhoneSearch(){
        WebElement searchField = driver.findElement(searchFieldBy);
        searchField.sendKeys("IPhone" + Keys.ENTER);
        List<WebElement> iPhoneList = driver.findElements(nameOfProductBy);
        for (WebElement iPhone: iPhoneList){
            List<WebElement> iPhoneList = iPhone.findElement(nameOfProductBy);
            String nameOfProduct iPhoneList.get(iPhoneList.size() - 1).getText();
            boolean checkForIphone(nameOfProduct, "IPhone");

        }
    }

    @Test
    public void SamsungSearch(){
        WebElement searchField = driver.findElement(searchFieldBy);
        searchField.sendKeys("Samsung" + Keys.ENTER);
        List<WebElement> samsungList = driver.findElements(nameOfProductBy);
        for (WebElement samsung: samsungList){
            List<WebElement> samsungList = samsung.findElement((nameOfProductBy);
            String nameOfProduct samsungList.get(samsungList.size() - 1).getText();
            boolean checkForIphone(nameOfProduct, "Samsung");

        }
    }


}
