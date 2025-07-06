package tests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.testng.annotations.*;
import utils.ExtentManager;

public class testextentreport {

    ExtentReports extent;
    ExtentTest test;

    @BeforeSuite
    public void setupReport() {
        extent = ExtentManager.getInstance();
    }

    @Test
    public void testPrintNumber() {
        test = extent.createTest("Print Number Test one extent");
        System.out.println("Executing test...");
        test.pass("Test executed successfully");
    }
    @Test
    public void testPrintNumberThree() {
        test = extent.createTest("Print Number Test two extent");
        System.out.println("Executing test...");
        test.pass("Test executed successfully");
    }
    @Test
    public void testPrintNumberFour() {
        test = extent.createTest("Print Number Test three extent");
        System.out.println("Executing test...");
        test.pass("Test executed successfully");
    }

    @AfterSuite
    public void tearDownReport() {
        extent.flush();
    }
}
