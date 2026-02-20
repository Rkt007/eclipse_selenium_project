package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginWithoutPOM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//launch browser
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();

//open url
driver.get("https://www.saucedemo.com/v1/");

// user id
driver.findElement(By.id("user-name")).sendKeys("standard_user");


// password
driver.findElement(By.id("password")).sendKeys("secret_sauce");

//click action 
driver.findElement(By.id("login-button")).click();

driver.close();
}
}