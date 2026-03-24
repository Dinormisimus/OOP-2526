import java.util.Scanner;

public class Zadatak4_6 {
    public static void main(String[] args){
        String unos;
        String a = "dobro";
        String b = "bolje";
        String c = "najbolje";
        Scanner sc = new Scanner(System.in);
        System.out.print("Kako ste danas: ");
        unos = sc.next();

        if (unos.equals(a)){
            System.out.println("Danas sam: " + a);
        }else if(unos.equals(b)){
            System.out.println("Danas sam: " + b);
        }else if(unos.equals(c)){
            System.out.println("Danas sam: " + c);
        }else{
            System.out.println("Sigurno će biti bolje :D");
        }

    }
}
