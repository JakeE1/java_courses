package learn_by_cours;

import java.io.Console;
import java.sql.SQLOutput;
import java.sql.Time;
import java.util.Scanner;
import static java.lang.Math.*;
import static java.lang.System.console;

// wrong name of class, InitialExample better name for this class
public class initial_example {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("putting your balance");
          int Speed, Distance, c = 120;char x = 200; char y = 120;
          x = (char) (x/y);
        System.out.println(x);
        System.out.printf("Write your speed \n");
        Speed = in.nextInt();
        System.out.printf("Write your Distance \n");
        Distance = in.nextInt();

        if (c <= Speed) {
            System.out.println("you are under speed limit");
        }

       double Double_Distance = (double)Math.round(Distance);
        System.out.println("Double_Distance" + Double_Distance);
        double Double_Speed = (double)Math.round(Speed);
        System.out.println("Double_Speed" + Double_Speed);

        double Time_double = Double_Distance/(Double_Speed/60);
        System.out.println(Time_double);
        System.out.printf("You are coming to your target throw %4.2f minutes ",Time_double);
    }

}