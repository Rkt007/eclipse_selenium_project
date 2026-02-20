package Allmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import base.DriverFactory;

public class iFrameTest {

    WebDriver driver;

    @Test
    public void frameCheckTest() {

        driver = DriverFactory.getDriver();
        driver.get("https://www.rediff.com/");

        // Switch to iframe
        driver.switchTo().frame("moneyiframe");

        WebElement el = driver.findElement(By.id("bseindex"));
        el.click();

        System.out.println("BSE Value: " + el.getText());
        
       
    }

    
//    @AfterMethod
//    public void tearDown() {
//        DriverFactory.quitriver();
   
    }
    