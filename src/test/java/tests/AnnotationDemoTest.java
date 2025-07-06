package tests;

import io.qameta.allure.*;
import org.testng.annotations.*;

@Epic("User Management")
@Feature("Login Feature")
public class AnnotationDemoTest {

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Before Suite: Setup system properties");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("After Suite: Clean up system properties");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("Before Test: Connect to DB");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("After Test: Disconnect from DB");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Before Class: Launch browser");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("After Class: Close browser");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before Method: Login to app");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("After Method: Logout from app");
    }

    @Test(priority = 1, description = "Valid login test")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Test login with valid credentials")
    public void validLoginTest() {
        System.out.println("Executing validLoginTest");
    }

    @Test(priority = 2, dependsOnMethods = "validLoginTest", groups = {"smoke"})
    @Severity(SeverityLevel.NORMAL)
    @Description("Access dashboard after login")
    public void accessDashboardTest() {
        System.out.println("Executing accessDashboardTest");
    }

    @Test(priority = 3, enabled = false)
    @Description("This test is disabled")
    public void disabledTest() {
        System.out.println("This should not run");
    }

    @Test(priority = 4, dataProvider = "loginData")
    @Description("Login test with multiple credentials")
    public void dataDrivenLoginTest(String username, String password) {
        System.out.println("Testing login with: " + username + " / " + password);
    }

    @DataProvider(name = "loginData")
    public Object[][] loginDataProvider() {
        return new Object[][] {
                {"user1", "pass1"},
                {"user2", "pass2"}
        };
    }

    @Factory
    public static Object[] factoryMethod() {
        return new Object[] { new AnnotationDemoTest() };
    }
}
