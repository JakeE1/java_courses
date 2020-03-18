package learn_by_cours;

import java.sql.SQLOutput;
import java.util.Scanner;

// wrong name of class, InitialExample better name for this class
public class initial_example {
    public static void main(String[] args) {
        System.out.println("program for converting cm in inch");
        Scanner in = new Scanner(System.in);
        final double CM_IN_INCH = 2.54 ;
        System.out.println("Input a number");
        Double NumberThatInput = in.nextDouble();
        System.out.println("Result of converting = " + NumberThatInput * CM_IN_INCH );
        in.close();




    }

}
