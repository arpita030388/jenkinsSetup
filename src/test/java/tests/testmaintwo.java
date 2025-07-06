package tests;

import io.qameta.allure.Description;
import org.testng.annotations.Test;

import static org.example.Main.printNumber;

public class testmaintwo {
    @Test
    @Description("This test prints a number from two")
    public void TestPrintNumbertwo(){
        printNumber();
    }

}
