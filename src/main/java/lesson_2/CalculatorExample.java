package lesson_2;

public class CalculatorExample {

    static void main() {
        int number1 = 40;
        int number2 = 3;

        int sumResult = number1 + number2;
        int minusResult = number1 - number2;
        int multiplyResult = number1 * number2;
        double divideResult =  (double) number1 / number2;
        int modulusResult = number1 % number2;

        System.out.println("Sum result = " + sumResult);
        System.out.println("Minus result = " + minusResult);
        System.out.println("Multiply result = " + multiplyResult);
        System.out.println("Divide result = " + divideResult);
        System.out.println("Modulus result = " + modulusResult);
    }
}
