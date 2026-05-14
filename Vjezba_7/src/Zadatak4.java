import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class Zadatak4 {

    public static void main(String[] args) {

        LinkedList<String> lista = new LinkedList<>();

        try {

            File file = new File("tekst.txt");

            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {
                lista.add(sc.nextLine());
            }

            sc.close();

        } catch (FileNotFoundException e) {

            System.out.println("Datoteka nije pronađena.");
        }

        System.out.println("Originalna lista:");
        System.out.println(lista);

        Collections.sort(lista, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }
        });

        System.out.println("Sortirano po duljini stringova:");
        System.out.println(lista);
    }
}