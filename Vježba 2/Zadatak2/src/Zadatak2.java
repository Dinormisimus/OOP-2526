import java.util.Scanner;
import java.util.Arrays;

public class Zadatak2{
    public static void main(String[] args){
        int unos;
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite koliko će te temperatura unjeti: ");
        unos = sc.nextInt();

        double[] lista = new double[unos];

        int counter = 0;
        while(counter < unos){
            Scanner sc1 = new Scanner(System.in);
            System.out.print("Unesite temperaturu: ");
            lista[counter] = sc1.nextDouble();
            counter++;
        }
        int sum = 0;
        for(double i : lista){
            sum += i;
        }
        double prosjek = sum / counter;

        int vise_od = 0;
        int manje_od = 0;
        int jednako = 0;
        for(double i : lista){
            if(i > prosjek){
                vise_od++;
            }else if(i < prosjek){
                manje_od++;
            }else{
               jednako++;
            }
        }

        System.out.println("Broj mjerenja: " + unos);
        System.out.println("Temperature iznad prosjeka: "+ vise_od);
        System.out.println("Temperature ispod prosjeka: "+ manje_od);
        System.out.println("Temperature jednake prosjeku: "+ jednako);
        System.out.println("Srednja temperatura: " + prosjek);
    }}