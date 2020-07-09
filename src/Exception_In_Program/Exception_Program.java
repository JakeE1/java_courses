package Exception_In_Program;

import java.util.Scanner;

public class Exception_Program {


    static boolean condition() {
        double x =  0.01 ;
        x = x + 0.1;
        boolean result = x < 0.99;
        System.out.printf(" %f,  %b , ", x, result);

        return result;
    }

    public static void main(String[] args) {
        while (condition()) System.out.println("Inside 'while'" );
        System.out.println("Exited 'while'");
    }


}