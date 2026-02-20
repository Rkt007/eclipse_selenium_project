package GoogleTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

 WebDriverManager.chromedriver().setup();
 WebDriver driver = new ChromeDriver();
 driver.get("https://www.amazon.in/");	
 
 String expecteditem ="Apple iPhone 17 (256 GB) - Pink";
 try {
	Thread.sleep(5000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
WebElement searbox= driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
searbox.sendKeys("iphone");
searbox.submit();


List <WebElement> All= driver.findElements(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
	for (WebElement e1 :All)
	{
		e1.getText().equalsIgnoreCase("expecteditem");
		WebElement Addtocart= driver.findElement(By.id("a-autoid-4-announce"));
		Addtocart.click();
	}

	

	}

}
