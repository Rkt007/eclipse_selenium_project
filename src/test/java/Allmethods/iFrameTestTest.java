package Allmethods;

import org.openqa.selenium.By;
import base.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class iFrameTestTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		//WebDriver Driver =new ChromeDriver();
		WebDriver driver = DriverFactory.getDriver();
		driver.get("https://www.rediff.com/");
		
//	switch to frame	
		driver.switchTo().frame("moneyiframe");
		
//driver.findElement(By.id("bseindex")).click();
		WebElement el = driver.findElement(By.xpath("//span[@id='bseindex']"));
		el.click();
		System.out.println(el.getText());

		driver.quit();
	}
	
}
