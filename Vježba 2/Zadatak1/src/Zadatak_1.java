import java.util.Scanner;
import java.util.Arrays;

public class Zadatak_1{
    public static void main(String[] args){
        String[] string1 = {"Vasa", "vana plurimum","sonant"};
        String[] string2 = new String[4];

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 4; i++){
            System.out.print("Unesite " + (i + 1) + ". element: ");
            string2[i] = sc.nextLine();
        }

        System.out.println(string1[0] + " " + string1[1] + " " + string1[2]);

        for(int i = 0; i < 4; i++){
            System.out.println(string2[i]);
        }

    }

}