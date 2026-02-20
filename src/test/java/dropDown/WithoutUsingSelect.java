package dropDown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WithoutUsingSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		WebDriver Driver = new ChromeDriver();

		Driver.manage().window().maximize();
		Driver.get("https://demo.automationtesting.in/Register.html");
//		 WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(100));
//	        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Skills")));

		List<WebElement> drp = Driver.findElements(By.id("skills"));
		System.out.println("all listed element:" + drp.size());
		for (WebElement e1 : drp) {
			e1.getText().equals("XML");
			e1.click();
		}
		// Close browser
		Driver.quit();

	}

}
