package test.java.lesson9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import test.java.TestBaseSetup;
import test.java.pages.ResultPage;
import test.java.pages.HomePage;

import java.util.List;

public class PoTest extends TestBaseSetup {
    HomePage homePage;
    ResultPage giftPage;

    @BeforeMethod
            public void pageInitialize(){
        homePage = new HomePage(driver);
        resultPage = new ResultPage(driver);
    }



    public void pageInitialize(){
    homePage = new HomePage();
}

    @Test
    public void test1(){

        homePage
                .open()
                .clickSellBtn()
                .clickRegistryBtn()
                .clickGiftCardBtn();
        giftPage.clickPrice("200 & Above");

        List<WebElement> iPhoneList = driver.findElements().(By.xpath("//span[@class=\"a-size-medium a-color-base a-text-normal\"]"));
        for (WebElement iPhone: iPhoneList){
            List<WebElement> iPhoneList = iPhone.findElement(By.xpath("//span[@class=\"a-size-medium a-color-base a-text-normal\"]"));
            String nameOfProduct iPhoneList.get(iPhoneList.size() - 1).getText();
            boolean checkForIphone(nameOfProduct, "IPhone");

        }


    }


}
