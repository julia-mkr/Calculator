package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SubtractionTest extends BaseTest {

    @Test(dataProvider = "Test data for SubtractionTest Class", dataProviderClass = TestDataProvider.class,
            description = "The test calculates the subtraction of two positive integers",
            invocationCount = 4, threadPoolSize = 2, retryAnalyzer = Retry.class)
    public void subtractNumbersTest(int firstNum, int secondNum, int expectedResult) {
        Assert.assertEquals(subtraction.subtractPositiveIntegerNumbers(firstNum, secondNum), expectedResult);
    }

    @Test(description = "The test calculates the subtraction of two integers, where the second integer is " +
            "greater than the first. The output will be -1, because you can't subtract a greater number from a smaller one")
    public void subtractNumbersWhereSecondNumberIsGreaterThanFirstTest() {
        Assert.assertEquals(subtraction.subtractPositiveIntegerNumbers(58, 325), -1);
    }

    @Test(description = "The test calculates the subtraction of two negative integers")
    public void subtractNegativeNumbersTest() {
        Assert.assertEquals(subtraction.subtractNegativeIntegerNumbers(-32, -3), -29);
    }

    @Test(description = "The test calculates the subtraction of two integers, where the first integer is negative")
    public void subtractNumbersWhereFirstNumberIsNegativeTest() {
        Assert.assertEquals(subtraction.subtractNegativeIntegerNumbers(-3612, 632), -4244);
    }

    @Test(description = "The test calculates the subtraction of two integers, where the second one is negative")
    public void subtractNumbersWhereSecondNumberIsNegativeTest() {
        Assert.assertEquals(subtraction.subtractNegativeIntegerNumbers(902, -6), 908);
    }

    @Test(description = "The test calculates the subtraction of two positive double numbers and outputs rounding value",
            invocationCount = 4, threadPoolSize = 2, retryAnalyzer = Retry.class)
    public void subtractDoubleNumbersTest() {
        Assert.assertEquals(subtraction.subtractPositiveDoubleNumbers(265.23, 36.95), 228.0);
    }

    @Test(description = "The test calculates the subtraction of two double numbers, where the second number is greater than" +
            "the first one. The output will be -1, because you can't subtract a greater number from a smaller one")
    public void subtractDoubleNumbersWhereSecondNumberIsGreaterThanFirstTest () {
        Assert.assertEquals(subtraction.subtractPositiveDoubleNumbers(3.2, 16.5), -1);
    }

    @Test(description = "The test calculates the subtraction of two negative double numbers and outputs rounding value")
    public void subtractNegativeDoubleNumberTest() {
        Assert.assertEquals(subtraction.subtractNegativeDoubleNumbers(-63.3, -51.82), -11.0);
    }
}
