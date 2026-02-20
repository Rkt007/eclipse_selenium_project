package GoogleTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtionCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Saloni Tiwari\\\\OneDrive\\\\Desktop\\\\API Tester\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.calculator.net/");
		
	List <WebElement> AllRadioButton=driver.findElements(By.xpath("//input[@type='radio']"));           //for all radio button
	
	System.out.println("Total link of web page:" +AllRadioButton.size());
	
	for(WebElement  el:AllRadioButton)
		
		System.out.println(el.getText());
	}
}