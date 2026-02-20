package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleCheckBox {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");

        // Wait for the page to load
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Get all checkboxes
        List<WebElement> allcheckboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
        System.out.println("Total checkboxes: " + allcheckboxes.size());

        // ✅ Select specific checkboxes (Monday and Sunday)
        for (WebElement chbox : allcheckboxes) {
            String checkboxName = chbox.getAttribute("id");
            if (checkboxName != null && (checkboxName.equalsIgnoreCase("monday") || checkboxName.equalsIgnoreCase("sunday"))) {
                chbox.click();
            }
        }

        // ✅ Select last 2 checkboxes
        int totalCheckboxes = allcheckboxes.size();
        for (int i = totalCheckboxes - 2; i < totalCheckboxes; i++) {
            allcheckboxes.get(i).click();
        }

        // Optional: close the browser
        // driver.quit();
    }
}
