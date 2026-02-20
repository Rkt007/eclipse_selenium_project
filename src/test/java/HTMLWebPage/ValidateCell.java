package HTMLWebPage;

import java.util.List;

import base.DriverFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ValidateCell {
	
	@Test
	public void columnValidate()
	{
//		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Saloni Tiwari\\\\OneDrive\\\\Desktop\\\\API Tester\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
//		 WebDriver driver = new ChromeDriver();
			 WebDriver Driver = DriverFactory.getDriver();
		
		Driver.get("file:///C:/Users/Saloni%20Tiwari/OneDrive/Desktop/sampleHTML.html");
		
	//	find second cell in web table and print 
		
	String text=	Driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]")).getText();
	System.out.println(text); 
	
//	find total rows  in web table and print 
	List <WebElement> rowlist =Driver.findElements(By.xpath("//table/tbody/tr")); 
	System.out.println(rowlist.size());
	
//	find total column  in web table and print 
	List <WebElement> columnlist =Driver.findElements(By.xpath("//table/tbody/tr[1]/th")); 
	System.out.println(columnlist.size());
	
	 for(int r=2; r<=rowlist.size();r++)
	 {
		 for(int c=1; r<=columnlist.size();c++) 
		 {
			 String data =	Driver.findElement(By.xpath("//table/tbody/tr[" + r + "]/td[" + c + " ]")).getText();
					 System.out.println(data); 
		 }
	}
	
	}}
