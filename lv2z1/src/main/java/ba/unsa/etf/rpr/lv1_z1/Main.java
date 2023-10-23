package ba.unsa.etf.rpr.lv1_z1;
import java.util.Scanner;


public class Main {



    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Unesite broj: ");
        double broj= scan.nextInt();
        System.out.println("Sinus broja je " + Racun.Sinus(broj) + ", a faktorijel je " + Racun.Faktorijel(broj));

    }


}