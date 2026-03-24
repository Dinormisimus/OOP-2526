import java.util.Scanner;

public class Zadatak4_4 {
    public static void main(String[] args){
        while(true){
            String unos;
            Scanner sc = new Scanner(System.in);
            System.out.print("Unesite string: ");
            unos = sc.nextLine();
            System.out.println(unos);
            String pitanje;
            Scanner scc = new Scanner(System.in);
            System.out.print("Želite li ponoviti unos: y/n: ");
            pitanje = scc.next();
            if(pitanje.equalsIgnoreCase("y")){
                continue;
            }
            else{
                System.out.println("Izabrali ste izlaz iz programa!");
                break;
            }
        }
    }
}
