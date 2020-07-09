package programms;


import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Date;
import java.util.Scanner;

public class ConvertingCMtoINCH {
    public static void main(String[] args) {

        System.out.printf("Hello, date : %1$te %1$tB,  time is  %1$tT \n", new Date());
        System.out.println("program for converting cm in inch");
        Scanner in = new Scanner(System.in);
        final double CM_IN_INCH = 2.54;
        System.out.println("Input a number ");
        int NumberThatInput = in.nextInt();
        System.out.printf("Result of converting %4.2f ", (NumberThatInput / CM_IN_INCH));
        in.close();
    }
}
