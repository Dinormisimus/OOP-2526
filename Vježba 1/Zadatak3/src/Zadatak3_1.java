import java.util.Scanner;

public class Zadatak3_1 {
        public static void main(String[] args) {
            int unos;
            Scanner sc = new Scanner(System.in);
            System.out.print("Unesite cijeli broj: ");
            while(!sc.hasNextInt()){
                System.out.println("Niste unjeli cijeli broj!");
                sc.next();
                System.out.print("Pokušajte ponovno: ");

            }

            unos = sc.nextInt();
            System.out.println("Unjeli ste broj "+ unos);

        }
}