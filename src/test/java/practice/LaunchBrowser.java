package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");  //  open browser
	System.out.println("Title of web page:"+ driver.getTitle());     // title of page
	System.out.println("url of web page:"+ driver.getCurrentUrl()); 
	System.out.println("page source of web page:"+ driver.getPageSource()); 
	
	
	}

}
