package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// With PageFactory
public class LoginPage2 {
    
    WebDriver driver;

    // Constructor to initialize the driver and PageFactory
    public LoginPage2(WebDriver d) {
        this.driver = d;
        PageFactory.initElements(driver, this); // Corrected placement
    }

    // Identify web elements using @FindBy
    @FindBy(id = "user-name")
    WebElement username;

    @FindBy(id = "password")
    WebElement password;

    @FindBy(id = "login-button")
    WebElement loginBtn;

    
  //  action perform
    // Method to enter username
    public void enterUsername(String Uname) {
        username.sendKeys(Uname);
    }

    // Method to enter password
    public void enterPassword(String pwd) {
        password.sendKeys(pwd);
    }

    // Method to click login
    public void clickLogin() {
        loginBtn.click();
    }
}
