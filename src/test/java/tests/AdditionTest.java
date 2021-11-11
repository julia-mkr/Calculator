package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AdditionTest extends BaseTest {

    @Test(dataProvider = "Test data for AdditionTest Class", dataProviderClass = TestDataProvider.class,
            description = "The test calculates the sum of two positive integers",
            invocationCount = 4, threadPoolSize = 2, retryAnalyzer = Retry.class)
    public void sumNumbersTest(int firstNum, int secondNum, int expectedResult) {
        Assert.assertEquals(addition.addTwoIntegerNumbers(firstNum, secondNum), expectedResult);
    }

    @Test(description = "The test calculates the sum of two negative integers")
    public void sumNegativeNumbersTest() {
        Assert.assertEquals(addition.addTwoIntegerNumbers(-32, -959), -991);
    }

    @Test(description = "The test calculates the sum of two integers: the first one is negative, the second one - positive")
    public void sumNumbersWhereFirstNumberIsNegativeTest() {
        Assert.assertEquals(addition.addTwoIntegerNumbers(-235, 130), -105);
    }

    @Test(description = "The test calculates the sum of two integers: the first one is positive, the second one - negative")
    public void sumNumbersWhereSecondNumberIsNegativeTest() {
        Assert.assertEquals(addition.addTwoIntegerNumbers(782, -415), 367);
    }

    @Test(description = "The test calculates the sum of two double numbers and outputs rounding value",
            invocationCount = 4, threadPoolSize = 2, retryAnalyzer = Retry.class)
    public void sumDoubleNumbersTest() {
        Assert.assertEquals(addition.addTwoDoubleNumbers(3.55, 93.2), 97.0);
    }

    @Test(description = "The test calculates the sum of two double numbers and outputs rounding value")
    public void sumNegativeDoubleNumbersTest() {
        Assert.assertEquals(addition.addTwoDoubleNumbers(-32.5, -78.1), -111.0);
    }
}
