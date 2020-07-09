package learn_by_cours;

public class Program_Initial_Nowledges_in_String {
    public static void main(String[] args) {
            String mainString = "Checking" ;
            String underString = mainString.substring(0,3) + "lik";   // XD nice working
            int Number = 1 ;
            String mergedString = underString + "_" + Number ;
            String all = " / S / M / L / XL";
            String SecondTry = String.join("__", "V", "L", "A", "D");
        System.out.println(mergedString);
        System.out.println("che" + Number);
        System.out.println(all);
        System.out.println(SecondTry);

    }
}
