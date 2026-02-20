package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

WebDriverManager.chromedriver().setup();
		
		WebDriver Driver = new ChromeDriver();
		
		Driver.manage().window().maximize();
		Driver.get("https://www.google.com/");
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("Selenium");
	List <WebElement> listall=	Driver.findElements(By.xpath("//div[@id='Alh6id']//li"));
	System.out.println("suggested all no:"+listall.size());
	
	}

}
