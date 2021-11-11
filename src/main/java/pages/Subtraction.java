package pages;

public class Subtraction {

    public int subtractPositiveIntegerNumbers(int firstNumber, int secondNumber) {
        if (firstNumber < secondNumber) {
            return -1;
        } else {
            return firstNumber - secondNumber;
        }
    }

    public int subtractNegativeIntegerNumbers(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public double subtractPositiveDoubleNumbers(double firstDoubleNum, double secondDoubleNum) {
        if (firstDoubleNum < secondDoubleNum) {
        return -1;
        } else {
            return Math.round(firstDoubleNum - secondDoubleNum);
        }
    }

    public double subtractNegativeDoubleNumbers(double firstDoubleNum, double secondDoubleNum) {
        return Math.round(firstDoubleNum - secondDoubleNum);
    }
}
