package pages;

public class Division {

    public int divideIntegerNumbers(int firstNumber, int secondNumber) {
        if (firstNumber < secondNumber || secondNumber == 0) {
            return -1;
        } else {
            return firstNumber / secondNumber;
        }
    }

    public double divideDoubleNumbers(double firstDoubleNum, double secondDoubleNum) {
        if (secondDoubleNum == 0) {
            return -1;
        } else {
            return Math.round(firstDoubleNum / secondDoubleNum);
        }
    }
}
