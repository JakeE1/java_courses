package programms;

import java.util.Date;
import java.util.Scanner;
import programms.underpackage.CAN_I;

import static java.lang.Integer.parseInt;

/**
 * This program demonstrate console inputting
 * made by ARchNess
 */

public class Console_Input {
    public static void main(String[] args) {
//        System.out.printf("%1$s %2$te %2$tB %2$tT \n","NOW ", new Date());
//        System.out.println(new String("null"));
//        System.out.println((String)null);
//        Scanner in = new Scanner(System.in);
//        System.out.println("Hello, pls input your name ");
//        String NameOfPerson = in.nextLine();
//        int number = parseInt(NameOfPerson) + 100;
//        System.out.printf("Great, now %s pls input your age \n", number);
//        int AgeOfPerson = in.nextInt();
//        System.out.println("Ok, next year mr." + NameOfPerson + " you'll be "+ (AgeOfPerson+1) + " years" );
        System.out.println("_____________________");
        CAN_I can = new CAN_I();
        can.Testing();
        can.abd = 143;


    }
}
