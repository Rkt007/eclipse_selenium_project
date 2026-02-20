package DatePickerPractice;

import java.util.List;


import base.DriverFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class jqueryDatePicker2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		WebDriverManager.chromedriver().setup();
		 //WebDriver driver = new ChromeDriver();
		 WebDriver driver = DriverFactory.getDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/datepicker/");
		
		driver.switchTo().frame(0); // date picker is inside iframe
		
		WebElement date = driver.findElement(By.id("datepicker"));
		date.click();
		String exceptedMonth ="August";
		String exceptedYear ="2025";
		String excepteddate="25";
while (true) {
	
	String calenderMonth=	driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
	String calenderYear=	driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
	
	if (calenderMonth.equals(exceptedMonth) && calenderYear.equals(exceptedYear))
	{
		break;
	}
List<WebElement> date1= driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
	
for (WebElement alldate:date1)
{
	if (alldate.getText().equals(excepteddate))
	{
		alldate.click();
		break;
	}
	
	else {
		driver.findElement(By.xpath("")).click();
	}
	
}	

	}

	}}
