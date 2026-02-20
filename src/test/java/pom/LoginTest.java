package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	// launch browser
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	
//	create object of LoginPage
	LoginPage Loginpg2 =new LoginPage(driver);
	
	// open url
			driver.get("https://www.saucedemo.com/v1/");
			Loginpg2.enterUsername("standard_user");
			Loginpg2.enterPassword("secret_sauce");
			
			Loginpg2.clickLogin();
			
}
}