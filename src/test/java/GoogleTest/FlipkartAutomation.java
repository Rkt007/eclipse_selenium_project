package GoogleTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.DriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;
import java.util.List;

public class FlipkartAutomation {
    public static void main(String[] args) throws InterruptedException {
      WebDriverManager.chromedriver().setup();

      /*   open the url
      under the search option search mobile phone 
      choose the 2nd mobile
      get text of the price
      add to cart and verify price before and after  */
// 	 WebDriver driver = new ChromeDriver();
 	 WebDriver driver = DriverFactory.getDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com");

       
        try {
            WebElement closeLogin = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='✕']")));
            closeLogin.click();
        } catch (Exception e) {
            System.out.println("Login popup not displayed.");
        }

 
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("mobile phone");
        driver.findElement(By.cssSelector("button[type='submit']")).click();

     
        List<WebElement> phones = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(
                By.cssSelector("a._1fQZEK, a.IRpwTa")));

        if (phones.size() >= 2) {
            phones.get(1).click(); 
        } else {
            System.out.println("Less than 2 phones found in search results.");
            driver.quit();
            return;
        }

   
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }

     
        WebElement priceElement = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.cssSelector("._30jeq3._16Jk6d")));
        String priceText = priceElement.getText().replace("₹", "").replace(",", "").trim();
        int expectedPrice = Integer.parseInt(priceText);
        System.out.println("Product Price: ₹" + expectedPrice);

      
        WebElement addToCart = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//button[text()='Add to cart']")));
        addToCart.click();

       
        WebElement cartPriceElement = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.cssSelector("._2-ut7f._1WpvJ7, .Ob17DV"))); // Cart price selectors may vary
        String cartPriceText = cartPriceElement.getText().replace("₹", "").replace(",", "").trim();
        int cartPrice = Integer.parseInt(cartPriceText);
        System.out.println("Cart Price: ₹" + cartPrice);

        if (expectedPrice == cartPrice) {
            System.out.println("✅ Price matched!");
        } else {
            System.out.println("❌ Price mismatch!");
        }

        driver.quit();
    }
}
