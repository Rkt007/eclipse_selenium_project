package orangeHRM;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login {

    public String baseURL = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
    public WebDriver driver;

    @BeforeTest
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseURL);  
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    @Test(priority=1)
    public void testcase01() {
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click(); 

        String str = driver.getTitle();
        System.out.println("Page Title: " + str); 
    }

    // Logout Process
    public void logout() {
        driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).click();
        List<WebElement> elementList = driver.findElements(By.xpath("//a[@class='oxd-userdropdown-link']"));
        elementList.get(3).click();
        System.out.println("Logout Successful");
    }

    // Add Employee Module
    @Test(priority=2)
    public void addemployeePIM() {     
        driver.findElement(By.xpath("//span[normalize-space()='PIM']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Add Employee']")).click();
        driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Rahul");
        driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Tiwari");
        driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
        System.out.println("Employee Added Successfully");
    }

    // Search Employee By Name
    @Test(priority=3)
    public void SearchEmployeeByName() {     
        driver.findElement(By.xpath("//span[normalize-space()='PIM']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Employee List']")).click();
        driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("Rahul");
        driver.findElement(By.xpath("//button[normalize-space()='Search']")).click();
        System.out.println("Employee Searched Successfully");
    }

    @AfterTest
    public void teardown() throws InterruptedException {
        Thread.sleep(5000);
        logout(); // Ensure logout before quitting the browser
        driver.quit();  
    }
}
