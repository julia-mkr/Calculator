package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DivisionTest extends BaseTest {

    @Test(dataProvider = "Test data for DivisionTest Class", dataProviderClass = TestDataProvider.class,
            description = "The test calculates the division of two positive integers",
            invocationCount = 4, threadPoolSize = 2, retryAnalyzer = Retry.class)
    public void dividePositiveNumbersTest(int firstNum, int secondNum, int expectedResult) {
        Assert.assertEquals(division.divideIntegerNumbers(firstNum, secondNum), expectedResult);
    }

    @Test(description = "The test calculates the division of two integers, where the second integer is 0")
    public void divideNumberByZeroTest() {
        Assert.assertEquals(division.divideIntegerNumbers(5631, 0), -1);
    }

    @Test(description = "The test calculates the division of two positive integers, " +
            "where the first integer is bigger than the second one. The output will be -1, because dividing in this way a number" +
            "will give a floating-point number and the error will occur")
    public void divideNumbersWhereFirstNumberIsGreaterThanSecondTest() {
        Assert.assertEquals(division.divideIntegerNumbers(876, 5823), -1);
    }

    @Test(description = "The test calculates the division of two positive double numbers and outputs rounding value",
            invocationCount = 4, threadPoolSize = 2, retryAnalyzer = Retry.class)
    public void divideDoubleNumbersTest() {
        Assert.assertEquals(division.divideDoubleNumbers(569.2, 9.3), 61.0);
    }

    @Test(description = "The test calculates the division of two double numbers, where the second number is 0," +
            " the output will be -1")
    public void divideDoubleNumberByZeroTest() {
        Assert.assertEquals(division.divideDoubleNumbers(699.35, 0), -1);
    }
}
