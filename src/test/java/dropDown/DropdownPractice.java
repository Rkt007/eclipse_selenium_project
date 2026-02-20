package dropDown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		WebDriver Driver = new ChromeDriver();

		Driver.manage().window().maximize();
		Driver.get("https://demo.automationtesting.in/Register.html");
		WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(100));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Skills")));

		Select dropdown = new Select(element);
		dropdown.selectByVisibleText("C"); // Corrected method
		dropdown.selectByContainsVisibleText("C");
		// dropdown.selectByValue("98");
		dropdown.selectByIndex(1);
		// Checking if dropdown supports multiple selections
		if (dropdown.isMultiple()) {
			System.out.println("Dropdown supports multiple selections.");
		} else {
			System.out.println("Dropdown does not support multiple selections.");
		}

		// Print all dropdown values
		List<WebElement> allOptions = dropdown.getOptions();
		for (WebElement el : allOptions) {
			System.out.println(el.getText());
		}

		// Close browser
		Driver.quit();

	}

}
