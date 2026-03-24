import java.util.Scanner;

public class Zadatak4_7 {
    public static void main(String[] args){
        String unos;
        Scanner sc = new Scanner(System.in);
        System.out.print("Kako ste danas: ");
        unos = sc.nextLine();

        switch(unos){
            case "dobro":
                System.out.println("Hvala danas sam: " + unos); break;
            case "bolje":
                System.out.println("Hvala danas sam: " + unos); break;
            case "najbolje":
                System.out.println("Hvala danas sam: " + unos); break;
            default:
                System.out.println("Sigurno će biti bolje :D"); break;
        }
    }
}
