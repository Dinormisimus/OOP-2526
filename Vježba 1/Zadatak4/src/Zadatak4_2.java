/*
Riješite zadatak s izračunavanjem sume prvih N prirodnih brojeva,
ali na način da gornju granicu N određuje korisnički unos.
Vodite računa da korisnički unos ne prijeđe maksimalno dozvoljenu vrijednost za int tip podataka.
 */
import java.lang.Math;
import java.util.Scanner;

public class Zadatak4_2{
    public static void main(String[] args) {

        while (true) {
            int a;
            String s;
            Scanner sc = new Scanner(System.in);
            System.out.print("Unesite cijeli broj: ");
            s = sc.next();
            try {
                a = Integer.parseInt(s);
                int suma = 0;

                for (int i = 1; i <= a; i++) {
                    suma = suma + i;
                }
                System.out.println("Suma n prirodnih brojeva je: " + suma);
                break;


            } catch (NumberFormatException e) {
                System.out.println("Unesite broj u rasponu int-a");
            }
        }}}



