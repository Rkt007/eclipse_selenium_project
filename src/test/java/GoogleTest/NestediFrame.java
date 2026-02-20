package GoogleTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NestediFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver  Driver =new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
	}

}
