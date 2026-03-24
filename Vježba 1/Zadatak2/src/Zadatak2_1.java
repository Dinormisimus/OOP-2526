import java.util.Scanner;
import java.lang.Math;


public class Zadatak2_1 {
    public static void main(String[] args){
        double stranica;
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite stranicu: ");
        stranica = sc.nextDouble();

        double kvadrat = Math.pow(stranica,2);
        double kub = Math.pow(stranica,3);

        System.out.println("Kvadrat s unesenom stranicom je: " + kvadrat + " cm^2");
        System.out.println("Kub s unesenom stranicom je: " + kub + " cm^3");

    }

}
