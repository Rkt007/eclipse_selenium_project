package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementAndFindElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
		
	//	findElement -------------- return single webElement
WebElement searchbox=driver.findElement(By.xpath("//input[@id='small-searchterms']"));
searchbox.sendKeys("iphone");

//	findElement[S ]-------------- return All webElement
List <WebElement> AllElent=driver.findElements(By.xpath("//div[@class='footer']//a"));
System.out.println("Total on page:"+AllElent.size());;
for(WebElement el:AllElent)
{
	
//	String str=el.getText();
	System.out.println(el.getText());
	
}

	}

}
