package Exception_In_Program;

import java.util.Scanner;

public class Exception_Program {
    public static void main(String[] args) {

        System.out.println("program for converting cm in inch");
        Scanner in = new Scanner(System.in);
        final double CM_IN_INCH = 2.54;
        System.out.println("Input a number");
        Double NumberThatInput = in.nextDouble();
        System.out.println("Result of converting = " + NumberThatInput * CM_IN_INCH);
        in.close();

    }
}