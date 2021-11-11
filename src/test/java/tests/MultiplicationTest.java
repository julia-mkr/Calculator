package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MultiplicationTest extends BaseTest {

    @Test(dataProvider = "Test data for MultiplicationTest Class", dataProviderClass = TestDataProvider.class,
            description = "The test calculates the multiplication of two positive integers",
            invocationCount = 4, threadPoolSize = 2, retryAnalyzer = Retry.class)
    public void multiplyPositiveNumbersTest(int firstNum, int secondNum, int expectedResult) {
        Assert.assertEquals(multiplication.multiplyIntegerNumbers(firstNum,secondNum), expectedResult);
    }

    @Test(description = "The test calculates the multiplication of two negative integers")
    public void multiplyNegativeNumbersTest() {
        Assert.assertEquals(multiplication.multiplyIntegerNumbers(-44, -224), 9856);
    }

    @Test(description = "The test calculates the multiplication of two integers, where the first one is negative")
    public void multiplyNumbersWhereFirstNumberIsNegativeTest() {
        Assert.assertEquals(multiplication.multiplyIntegerNumbers(-362, 782), -283084);
    }

    @Test(description = "The test calculates the multiplication of two positive double numbers and outputs rounding value",
            invocationCount = 4, threadPoolSize = 2, retryAnalyzer = Retry.class)
    public void multiplyPositiveDoubleNumbersTest() {
        Assert.assertEquals(multiplication.multiplyDoubleNumbers(23.2, 89.25), 2071.0);
    }

    @Test(description = "The test calculates the multiplication of two negative double numbers and " +
            "outputs rounding value")
    public void multiplyNegativeDoubleNumbersTest() {
        Assert.assertEquals(multiplication.multiplyDoubleNumbers(-523.2, -11.36), 5944.0);
    }
}
