package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import pages.*;

@Listeners(TestListener.class)
public class BaseTest {
    Addition addition;
    Subtraction subtraction;
    Multiplication multiplication;
    Division division;

    @BeforeMethod
    public void initTest() {
        addition = new Addition();
        subtraction = new Subtraction();
        multiplication = new Multiplication();
        division = new Division();
    }

    @AfterMethod
    public void doSomethingAfter() {
        System.out.println("The method is completed");
    }
}
