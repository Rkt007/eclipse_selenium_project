package GoogleTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import base.DriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;

public class frameAndIframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	concept of frameAndIframe
		
WebDriverManager.chromedriver().setup();
//WebDriver driver = new ChromeDriver();
WebDriver driver = DriverFactory.getDriver();
driver.get("https://www.rediff.com");

//find element of iframe and frame
/*  by id or by name
    by webelement
     by index             */
driver.switchTo().frame("moneyiframe");

String nseindex=driver.findElement(By.id("nseindex")).getText();
System.out.println(nseindex);




	}

}
