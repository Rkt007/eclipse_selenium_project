package business2sell;

import java.time.Duration;
import java.util.Collection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class nextpage {

    public static void main(String[] args) {

        // Setup ChromeDriver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Open the Business2Sell page
        driver.get("https://www.business2sell.com.au/businesses");

        // Explicit wait to handle dynamic elements
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

      
          
                // Wait for page content to load
      //          Thread.sleep(1000);
         
    
            // Now we are on page 469. Extract business titles
  driver.findElements(By.xpath("//nav[@aria-label='Page navigation example']//li[3]/a"));
 // Collection<WebElement> businessTitles =  
Actions    action =Actions(driver.findElements(By.xpath("//nav[@aria-label='Page navigation example']//li[3]/a")));
action.click();
    


	
	}

	private static Actions Actions(List<WebElement> elements) {
		// TODO Auto-generated method stub
		return null;
	}
    }
    

