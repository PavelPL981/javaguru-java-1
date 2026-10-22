package lesson_4.lessoncode;

import java.util.Scanner;

public class StudentMark {

    public static final int A_90 = 90;
    public static final int A_100 = 100;

    public static final int B_80 = 80;
    public static final int B_89 = 89;

    public static final int C_70 = 70;
    public static final int C_79 = 79;

    public static final int D_60 = 60;
    public static final int D_69 = 69;

    public static final int F_0 = 0;
    public static final int F_59 = 59;

    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a student mark in range [0:100]");
        int mark = Integer.parseInt(scanner.nextLine());

        checkStudentMark(mark);
    }

    public static void checkStudentMark(int mark) {
        if (mark <= A_100 && mark >= A_90) {
            System.out.println("Student mark = " + mark + " = A");
        } else if (mark <= B_89 && mark >= B_80) {
            System.out.println("Student mark = " + mark + " = B");
        } else if (mark <= C_79 && mark >= C_70) {
            System.out.println("Student mark = " + mark + " = C");
        } else if (mark <= D_69 && mark >= D_60) {
            System.out.println("Student mark = " + mark + " = D");
        } else if (mark <= F_59 && mark >= F_0) {
            System.out.println("Student mark = " + mark + " = F");
        } else {
            System.out.println("Error");
        }
    }
}
