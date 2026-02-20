package practice;

import java.time.Duration;

import base.DriverFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboadAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 WebDriverManager.chromedriver().setup();
//		 WebDriver driver = new ChromeDriver();
			 WebDriver driver = DriverFactory.getDriver();

	     
	            // Set up explicit wait
	            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	            // Open Google
	            driver.manage().window().maximize();
	            driver.get("https://text-compare.com/");
	            
	          
	            driver.findElement(By.xpath("//textarea[@id='inputText1']")).sendKeys("Hello Rahul") ;
	            
	            Actions Action= new Actions(driver);
	            
	     //       ctlr + A
	            Action.keyDown(Keys.CONTROL);
	            Action.sendKeys("a");
	            Action.keyUp(Keys.CONTROL);
	            Action.perform();
	            
//	          ctlr + c
	            Action.keyDown(Keys.CONTROL);
	            Action.sendKeys("c");
	            Action.keyUp(Keys.CONTROL);
	            Action.perform(); 
	            
//		          tab
		            Action.keyDown(Keys.TAB);
		            Action.perform();      
		            
		    //        ctlr + v
		            Action.keyDown(Keys.CONTROL);
		            Action.sendKeys("v");
		            Action.keyUp(Keys.CONTROL);
		            Action.perform(); 
	            
}}
