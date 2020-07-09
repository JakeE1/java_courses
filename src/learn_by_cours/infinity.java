package learn_by_cours;

import java.math.BigDecimal;

public class infinity {
    public static <var> void main(String[] args) {


        System.out.println("_______________________________________");
            BigDecimal b1 = new BigDecimal("23.43");
            BigDecimal b2 = new BigDecimal("23.4300");
            BigDecimal b3 = new BigDecimal("24");
            System.out.println(b1.compareTo(b2) == 0); //1
            System.out.println(b1.compareTo(b3) == 1); //2
            System.out.println(b1.equals(b2)); //3
            System.out.println(b1.equals(new BigDecimal("23.43"))); //4
            System.out.println(b1 == b2); //5
            b2 = b2.add(new BigDecimal("0.57"));
            System.out.println(b3.equals(b2)); //6
        System.out.println("________________________________________");

            Integer i1 = 128;
            Integer i2 = 128;
            System.out.print(i1 == i2);
            Integer i3 = 126;
            Integer i4 = 126;
            System.out.print((i3 == i4 )+ "\n");



        MedicalStaff medic = new HeadDoctor ();
        if (medic instanceof Nurse) {
            System.out.println ("Nurse");
        } else if (medic instanceof Doctor) {
            System.out.println ("Doctor");
        } else if (medic instanceof HeadDoctor) {
            System.out.println ("HeadDoctor");
        }
    }
}
class MedicalStaff {}
class Doctor extends MedicalStaff {}
class HeadDoctor extends Nurse {}
class Nurse extends Doctor {}
