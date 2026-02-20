package business2sell;

import java.util.List;

import base.DriverFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class hyperlink {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		
		WebDriverManager.chromedriver().setup();
		
		//WebDriver driver = new ChromeDriver();
		 WebDriver driver = DriverFactory.getDriver();
		driver.manage().window().maximize();
		driver.get("https://www.calculator.net/");
		
	List <WebElement> alllink=driver.findElements(By.xpath("//div[@id='homelistwrap']//li"));
	
//	size of link (total link)
	System.out.println("size of link :"+alllink.size());
	
//	name of link 
	for (WebElement el:alllink)
	{
	String str=	el.getText();
	
	System.out.println("name of all link  :"+str);  
	
	Thread.sleep(5000);
	
//	footer message
	//div[@id='footerin']
	WebElement message=	(WebElement) driver.findElement(By.xpath("//div[@id='footerin']"));
	System.out.println("footer message  :"+message.getText());  
	}
	}

}
