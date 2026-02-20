package GoogleTest;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class linkedin {
	@Test
	public void LinkedinLogin() 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saloni Tiwari\\OneDrive\\Desktop\\\\API Tester\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.linkedin.com/signup?trk=guest_homepage-basic_nav-header-join");
	
		driver.findElement(By.xpath("//input[@id='email-or-phone']")).sendKeys("rahul.rkt007@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("");
		driver.findElement(By.xpath("//button[@id='join-form-submit']")).click();
		driver.getTitle();
	
}
	}