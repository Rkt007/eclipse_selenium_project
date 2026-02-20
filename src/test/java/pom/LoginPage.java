package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//Without page factory
public class LoginPage {

    WebDriver driver;
    
    // Constructor to initialize WebDriver
    public LoginPage(WebDriver d) {
        driver = d;
    }
    
    
 // Define locators as instance variables
    By username = By.id("user-name");
    By password = By.id("password");
    By loginButton = By.id("login-button");

    // Method to enter username
    public void enterUsername(String Uname) {
        driver.findElement(username).sendKeys(Uname); // Use parameter value
    }

    // Method to enter password
    public void enterPassword(String pwd) {
        driver.findElement(password).sendKeys(pwd); // Use parameter value
    }

    // Method to click login     // no need parameter value
    public void clickLogin() {
        driver.findElement(loginButton).click();
    }
}
