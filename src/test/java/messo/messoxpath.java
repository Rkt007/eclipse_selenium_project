package messo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class messoxpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.meesho.com/");
WebElement wb=		driver.findElement(By.xpath("//div[contains(text(),'Women Western Wear')]"));
	System.out.println("all text:"+wb.getText());
	}

}
