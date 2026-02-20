package GoogleTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Syconization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriverManager.chromedriver().setup();
	        WebDriver driver = new ChromeDriver();

	      
	            // Launch URL and configure browser
	            driver.manage().window().maximize();
	           
	            driver.get("https://www.google.com/");
	            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.findElement(By.name("q")).sendKeys("Selenium");
	  driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
	            
	          //a[@href='https://www.selenium.dev/']//h3[@class='LC20lb MBeuO DKV0Md'][normalize-space()='Selenium']
  driver.findElement(By.xpath(" //a[@href='https://www.selenium.dev/']//h3[@class='LC20lb MBeuO DKV0Md'][normalize-space()='Selenium']"));
	}

}
