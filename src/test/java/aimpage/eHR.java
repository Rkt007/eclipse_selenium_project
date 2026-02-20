package aimpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class eHR {
	@Test
	public void employee() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\Saloni Tiwari\\\\OneDrive\\\\Desktop\\\\API Tester\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://timesheet.altametrics.com/timesheet/jsf/security/login.jsp");
		Driver.manage().window().maximize();
		Driver.findElement(By.name("userName")).sendKeys("viewer");

		//Driver.findElement(By.name("password")).sendKeys("upx6(KXv&s#j]$i");
		//Driver.findElement(By.xpath("//input[@value='Login']")).click();

		//String cureeenWindowHandle = Driver.getWindowHandle();
		Driver.get(
				"https://idp.altametrics.com/idp/SamlReqProcessor?SAMLRequest=PHNhbWxwOkF1dGhuUmVxdWVzdCB4bWxuczpzYW1scD0idXJuOm9hc2lzOm5hbWVzOnRjOlNBTUw6Mi4wOnByb3RvY29sIiB4bWxuczpzYW1sPSJ1cm46b2FzaXM6bmFtZXM6dGM6U0FNTDoyLjA6YXNzZXJ0aW9uIiBJRD0iZW1qZ2lja2pvaGtvbW5sYWJia2NsZ3BrZm1lbGdvZWtrZmFqaGJrcCIgVmVyc2lvbj0iMi4wIiBJc3N1ZUluc3RhbnQ9IjIwMjUtMDMtMTVUMTA6MTE6NDIuMDQ3WiIgRGVzdGluYXRpb249IkFsdGFtZXRyaWNzIiBGb3JjZUF1dGhuPSJ0cnVlIiBJc1Bhc3NpdmU9ImZhbHNlIiBBc3NlcnRpb25Db25zdW1lclNlcnZpY2VVUkw9Imh0dHBzJTNBJTJGJTJGc3NvLm1jZGFsdGFtZXRyaWNzLmNvbSUyRmFpbSUyRlNhbWxQcm9jZXNzb3IuZG8lN0VTU08lN0VodHRwcyUzQSUyRiUyRnNzby5tY2RhbHRhbWV0cmljcy5jb20lMkZhaW0lMkYiIHNlc3Npb25LZXk9IlN5Vmd4NFlycTIrd2QvMzd3SWFPVkhEMFI1RE1jY1RmVG92QzMwaHEwUTZkV01yTWxlaUxRRGNCMUl2TnMzckxkWDZpb2M4TnRVNTFkUngyY3A3aEN3eVVybG1iT3hyRXQ5bGVKaHRPaStIRTU2RkswcEppRCtGUkxHN3lXRFN6MEM3S1BvTVJyeVdaWGdjaWVTR3F3eStNbDZGcGdKNWkvR2hnWko1T0wzbHNPaTVsZERNWkVjb0JmdjdLUEQzM0FiZnhYQmFJUGRCTWo5dlUzVE9zcE5XR09jbVJDOWJPL0YyMlJQYWVvUVYrS2ExNi90dCtGQXAvOGZyck5nS2xFU2RkeUN2cTQwQTlPaEQ4U1hPQjY1TXZMNGN4WFdwSVpIUUh6dUNoN2lvc1JIdWhkY3JCcitobTZwLzgyZWdGSFlUZmFXbEpRL054b1hKcTRTeHRldz09IiBleHRyYVBhcmFtPSIiPjxzYW1sOklzc3VlciB4bWxuczpzYW1sPSJ1cm46b2FzaXM6bmFtZXM6dGM6U0FNTDoyLjA6YXNzZXJ0aW9uIj5BbHRhbWV0cmljczwvc2FtbDpJc3N1ZXI%2BPC9zYW1scDpBdXRoblJlcXVlc3Q%2B/");
		//user name

		Driver.findElement(By.xpath("//input[@id='username']]")).sendKeys("rktiwari");

		// password 

		Driver.findElement(By.xpath("//input[@id='password']]")).sendKeys("df8hufcC");

		// click action perform

		Driver.findElement(By.xpath("//input[@value='Login']")).click();
		String cureeenWindowHandle1 = Driver.getWindowHandle();
		Driver.get("https://sso.mcdaltametrics.com/aim/mgmt/liveErsApps.jsp/");
		Driver.findElement(By.linkText("PRE_EREST_MON")).click();
		String cureeenWindowHandle2 = Driver.getWindowHandle();
		Driver.get("https://sso.mcdaltametrics.com/aim/login/RestrictedIpLoginController/PRE_EREST_MON?auto=true&isShowPromotion=false/");
		Driver.findElement(By.name("username")).sendKeys("alta");

		Driver.findElement(By.name("password")).sendKeys("myl0g1n");
		Driver.findElement(By.xpath("//input[@value='Continue login']")).click();
	}

}
