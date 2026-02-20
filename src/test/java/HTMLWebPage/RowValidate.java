package HTMLWebPage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RowValidate {
	
	//https://testautomationpractice.blogspot.com/
	
	public class ValidateCell {
		
		@Test
		public void columnValidate()
		{
			System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Saloni Tiwari\\\\OneDrive\\\\Desktop\\\\API Tester\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
			WebDriver Driver= new ChromeDriver();
			Driver.get("https://testautomationpractice.blogspot.com/");
			
		//	find second cell in web table and print 
			
		String text=	Driver.findElement(By.xpath("//td[normalize-space()='Learn Selenium']")).getText();
		System.out.println(text); 
		
//		find total rows  in web table and print 
		List <WebElement> rowlist =Driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr")); 
		System.out.println(rowlist.size());
		
//		find total column  in web table and print 
		List <WebElement> columnlist =Driver.findElements(By.xpath("//table[@name='BookTable']/tbody//tr/th")); 
		System.out.println(columnlist.size());

}}}
