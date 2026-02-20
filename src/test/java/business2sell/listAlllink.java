package business2sell;

import java.util.List;

import base.DriverFactory;

import base.DriverFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class listAlllink {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		//WebDriver driver = new ChromeDriver();
		 WebDriver driver = DriverFactory.getDriver();
// List of all link 
		driver.get("https://www.business2sell.com.au/businesses?page=1");
		driver.manage().window().maximize();
		int count =0;

		List <WebElement>LinkElements=	driver.findElements(By.tagName("a"));

		System.out.println("Total link of web page:" +LinkElements.size());

		for(WebElement  e1:LinkElements)

		System.out.println(e1.getText());
	//	count++;
		
           //	price
		WebElement price = driver.findElement(By.xpath("//div[contains(text(),'$165,000-$250,000')]"));
		System.out.println("Price: " + price.getText());
		WebElement str=	driver.findElement(By.xpath("//p[@id='lesslist-377494']"));
		System.out.println("str: " + str.getText());
		
		   //	category
		List <WebElement>LinkElements1=	(List<WebElement>) driver.findElements(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[2]/div[4]/div[2]/div[1]/div[1]/div[2]/div[2]/ul[1]/li"));

	for(WebElement  categoryPath:LinkElements1)
		System.out.print(categoryPath.getText());
	
	   // Next Page
	driver.findElement(By.xpath("//a[normalize-space()='»']")).click();
	}
}
