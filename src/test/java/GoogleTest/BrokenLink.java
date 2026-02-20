package GoogleTest;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import base.DriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLink {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

//   	 WebDriver driver = new ChromeDriver();
   	 WebDriver driver = DriverFactory.getDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://www.deadlinkcity.com/");

        // Find all <a> tags
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));

        System.out.println("Total links found: " + allLinks.size());

        for (WebElement element : allLinks) {
            String url = element.getAttribute("href");

            // Skip if href is null or empty
            if (url == null || url.isEmpty()) {
                System.out.println("URL is either null or empty");
                continue;
            }

            try {
                HttpURLConnection huc = (HttpURLConnection) (new URL(url).openConnection());
                huc.setRequestMethod("HEAD");
                huc.connect();
                int responseCode = huc.getResponseCode();

                if (responseCode >= 400) {
                    System.out.println(url + " is a broken link. Response Code: " + responseCode);
                } else {
                    System.out.println(url + " is a valid link. Response Code: " + responseCode);
                }

            } catch (Exception e) {
                System.out.println("Exception for URL: " + url + " -> " + e.getMessage());
            }
        }

        driver.quit();
    }
}
