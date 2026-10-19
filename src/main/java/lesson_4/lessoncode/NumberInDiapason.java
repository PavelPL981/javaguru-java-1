package lesson_4.lessoncode;

public class NumberInDiapason {

    public static final int FIRST = 1;
    public static final int TEN = 10;

    static void main() {
        int number = 7;

        boolean result1 = checkInsideRange(number);
        boolean result2 = checkOutsideRange(number);

        System.out.println("Number " + number + " is inside range [1:10] - " + result1);
        System.out.println("Number " + number + " is outside range [1:10] - " + result2);
    }

    public static boolean checkInsideRange(int a) {
        boolean isInRange = true;
        if ((a >= FIRST) && (a <= TEN)) {
            return isInRange;
        }
        return !isInRange;
    }

    public static boolean checkOutsideRange(int a) {
        boolean isOutsideRange = true;
        if (a < 1 || a > 10) {
            return isOutsideRange;
        }
        return !isOutsideRange;
    }
}
