package TestNGPractice;

import org.testng.annotations.*;

public class LoginHRTest {

    @BeforeSuite
    void beforeSuite() {
        System.out.println("BeforeSuite: Setup system properties or DB connection");
    }

    @BeforeTest
    void beforeTest() {
        System.out.println("BeforeTest: Launch browser");
    }

    @BeforeClass
    void beforeClass() {
        System.out.println("BeforeClass: Navigate to HR app login page");
    }

    @BeforeMethod
    void beforeMethod() {
        System.out.println("BeforeMethod: Prepare test data or state");
    }

    @Test
    public void loginHR() {
        System.out.println("Test: Executing loginHR test case");
        // You can simulate login logic here
        // e.g. loginPage.enterUsername("admin");
        //       loginPage.enterPassword("admin123");
        //       loginPage.clickLogin();
        //       Assert.assertTrue(homePage.isDashboardVisible());
    }

    @AfterMethod
    void afterMethod() {
        System.out.println("AfterMethod: Clean up after test");
    }

    @AfterClass
    void afterClass() {
        System.out.println("AfterClass: Close the HR application");
    }

    @AfterTest
    void afterTest() {
        System.out.println("AfterTest: Close browser");
    }

    @AfterSuite
    void afterSuite() {
        System.out.println("AfterSuite: Generate test report or close DB connection");
    }
}
