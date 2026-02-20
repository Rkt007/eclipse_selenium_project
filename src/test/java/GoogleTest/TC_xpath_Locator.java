package GoogleTest;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TC_xpath_Locator {
	
	@Test
	public void Locator()
	{
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Saloni Tiwari\\\\OneDrive\\\\Desktop\\\\API Tester\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
WebDriver driver= new ChromeDriver();

driver.get("https://timesheet.altametrics.com/timesheet/jsf/security/login.jsp");

//user name

driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("rktiwari");

// password 

driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Rahul@Tiwari07");

// click action perform

driver.findElement(By.xpath("//input[@value='Login']")).click();

// switch product page 

String cureeenWindowHandle =driver.getWindowHandle();
driver.switchTo().window(cureeenWindowHandle);
//list of elements
List <WebElement>LinkElements=	driver.findElements(By.tagName("a"));
System.out.println("Total link of web page:" +LinkElements.size());

//System.out.println("Element size:");
for(WebElement  e1:LinkElements)
	
	System.out.println(e1.getText());

//open link
driver.findElement(By.linkText("Feb 15, 2025")).click(); 

//Double click on hype  link
WebElement button = driver.findElement(By.xpath("//td[@id='Tasks:0:j_id_jsp_1399202896_132']//a[@class='plain'][normalize-space()='Friday']"));
Actions act =new Actions (driver);
act.doubleClick(button).perform();



}

}

