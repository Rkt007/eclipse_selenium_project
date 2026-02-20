package business2sell;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();

		driver.get("https://www.business2sell.com.au/businesses?page=1");
		driver.manage().window().maximize();
		
		  // Explicit Wait for dropdown to be visible
	       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
	        WebElement DropDown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='regionIndexContainer']")));
	//	Select DropDown=		(Select) driver.findElement(By.xpath("//div[@class='b2s_region']"));
//	DropDown.selectByVisibleText("Sydney");
		((Select) DropDown).selectByValue("Sydney");

	}

}
