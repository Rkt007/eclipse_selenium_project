import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageLogin {

    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");

        // Initialize the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the webpage
        driver.get("https://business2sell.com.au/businesses?page=1");

        try {
            // Locate the element containing the price
            WebElement priceElement = driver.findElement(By.xpath("//*[@id='__next']/div[2]/div/div[2]/div[3]/div[1]/div/div/div[2]/div[1]/div[1]/div/span"));
            String price = priceElement.getText();
            System.out.println("Price: " + price);

            // Locate the element containing the category
            WebElement categoryElement = driver.findElement(By.xpath("//*[@id='__next']/div[2]/div/div[2]/div[3]/div[1]/div/div/div[2]/div[1]/div[2]"));
            String category = categoryElement.getText();
            System.out.println("Category: " + category);

        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}