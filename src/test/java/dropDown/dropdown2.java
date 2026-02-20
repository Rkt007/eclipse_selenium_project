package dropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdown2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.id("Skills"));

		Select dropdown = new Select(element);
		dropdown.selectByVisibleText("C");

		if (dropdown.isMultiple()) {
			System.out.println("dropdown is multiple");
		} else {
			System.out.println("dropdown is not  multiple");
		}

//	list of webelemet 
		List<WebElement> alloptions = dropdown.getOptions();
		for (WebElement at : alloptions)

		{
			String opt = at.getText();

			System.out.println(opt);
		}
	}
}
