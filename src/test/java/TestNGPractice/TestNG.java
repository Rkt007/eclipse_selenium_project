package TestNGPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
;

public class TestNG {

	@Test
public void loginPage() 
{
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://testautomationpractice.blogspot.com/");
	String actualtitle =driver.getTitle();
	String expectedtitle =	"Automation Testing Practice";
	Assert.assertEquals(actualtitle, expectedtitle);
	
	driver.close();
}

}
