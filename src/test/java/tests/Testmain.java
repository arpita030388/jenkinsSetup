package tests;

import io.qameta.allure.Description;
import org.testng.annotations.Test;

import static org.example.Main.printNumber;

public class Testmain {

    @Test
    @Description("This test prints a number")
    public void TestPrintNumber(){
        printNumber();
    }

}
