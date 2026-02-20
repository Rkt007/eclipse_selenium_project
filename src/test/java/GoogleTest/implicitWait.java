package GoogleTest;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.base.Stopwatch;

public class implicitWait {

	@Test
	public void implicitWait() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Saloni Tiwari\\OneDrive\\Desktop\\\\API Tester\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.saucedemo.com/v1/");

		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");

		driver.findElement(By.id("login-button")).click();

		Stopwatch watch = null;
		try {
			watch = Stopwatch.createStarted();
			driver.findElement(By.linkText("Sauce Labs Bolt T-Shirt")).click();

		} catch (Exception e) {
			watch.stop();
			System.out.println(e);
			System.out.println(watch.elapsed(TimeUnit.SECONDS) + "second");
			 Assert.fail("Test failed because element was not found.");
		}
	}
}
