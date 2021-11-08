package tests;

import org.testng.annotations.DataProvider;

public class TestDataProvider {

    @DataProvider(name = "Test data for AdditionTest Class")
    public static Object[][] additionTestData() {
        return new Object[][] {
                {365, 8236, 8601},
                {86, 586, 672},
                {4328, 86622, 90950},
                {236595, 365, 236960},
                {5158, 3587, 8745}
        };
    }

    @DataProvider(name = "Test data for SubtractionTest Class")
    public static Object[][] subtractionTestData() {
        return new Object[][] {
                {236, 36, 200},
                {942, 672, 270},
                {95230, 5623, 89607},
                {8742, 4823, 3919},
                {20000, 4862, 15138}
        };
    }

    @DataProvider(name = "Test data for MultiplicationTest Class")
    public static Object[][] multiplicationTestData() {
        return new Object[][] {
                {230, 89, 20470},
                {23563, 0, 0},
                {1006, 16, 16096},
                {56262, 41, 2306742},
                {59, 639, 37701}
        };
    }

    @DataProvider(name = "Test data for DivisionTest Class")
    public static Object[][] divisionTestData() {
        return new Object[][] {
                {1500, 75, 20},
                {24562, 5, 4912},
                {15628, 67, 233},
                {2000000, 2500, 800},
                {20000000, 5,4000000}
        };
    }
}
