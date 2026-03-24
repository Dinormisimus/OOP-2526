/*
Riješite drugi zadatak s izračuavanjem volumena kugle, ali na način
da se ponavlja izračunavanje volumena za različite unose korisnika sve dok je polumjer manji od 10.
 */
import java.util.Scanner;
import java.lang.Math;

public class Zadatak4_1 {
    public static void main(String[] args){
        double a = 0;
        while(a < 10){
            Scanner sc = new Scanner(System.in);
            System.out.print("Unesite polumjer: ");
            a = sc.nextDouble();
        }
        double volumen;
        volumen = (3.0/4.0) * Math.PI * Math.pow(a,3);
        System.out.println("Volumen kugle je: " + volumen);

    }
}