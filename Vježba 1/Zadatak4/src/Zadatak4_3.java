import java.util.Scanner;

public class Zadatak4_3 {
    public static void main(String[] args){
        while(true){
            Scanner sc = new Scanner(System.in);
            System.out.print("Unesite broj: ");
            int unos;
            unos = sc.nextInt();

            if(unos != 158){
                System.out.println("Pokušajte ponovno!");
            }else if(unos == 158){
                System.out.println("Broj koji ste unjeli je točan!");
                break;
            }
        }
    }
}
