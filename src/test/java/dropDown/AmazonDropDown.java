package dropDown;

import java.time.Duration;

import base.DriverFactory;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
    //	Amazon using select input for dropdown

WebDriverManager.chromedriver().setup();

//WebDriver driver = new ChromeDriver();
WebDriver driver = DriverFactory.getDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=748926027055&hvpos=&hvnetw=g&hvrand=3358305541509711040&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9183545&hvtargid=kwd-64107830&hydadcr=14452_2417699&gad_source=1");
	
WebElement element =driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
element.click();
element.sendKeys("Baby");
//Select dropdown = new Select(element);
//dropdown.selectByVisibleText("Baby");
 
// list of webelemet 
//List<WebElement>  alloptions=dropdown.getOptions();
//for (WebElement at:alloptions)

//{ 
//	at.getSize();
//String	opt=	at.getText();

//System.out.println(opt);
//	}

}
}
