package flipcart;

import java.time.Duration;

import base.DriverFactory;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class searchBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	WebDriverManager.chromedriver().setup();
//	 WebDriver driver = new ChromeDriver();
		 WebDriver driver = DriverFactory.getDriver();
	driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("https://www.flipkart.com/");
WebElement search =driver.findElement(By.name("q"));
search.sendKeys("iphone");
search.submit();

List <WebElement> all =driver.findElements(By.xpath("//div[@class='ZFwe0M row']"));
	System.out.println("all element:"+all.size());
	
	for (WebElement el:all)
	{
	System.out.println(el.getText());
	}
	}

}
