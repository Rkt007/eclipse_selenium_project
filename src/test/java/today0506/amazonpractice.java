package today0506;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class amazonpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	WebDriverManager.chromedriver().setup();
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    WebElement view =	driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));

Actions act = new Actions(driver);
act.moveToElement(view).perform();


		driver.findElement(By.xpath("//span[@class='nav-action-inner']")).click();
		
	}

}
