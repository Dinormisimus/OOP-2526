import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Zadatak_3 {

    public static void popuniSkup(Set<String> skup) {

        skup.add("Java");
        skup.add("Python");
        skup.add("C++");
        skup.add("PHP");
        skup.add("SQL");
    }

    public static void provjeriElement(Set<String> skup, String trazeni) {

        if (skup.contains(trazeni)) {
            System.out.println(trazeni + " postoji u skupu.");
        } else {
            System.out.println(trazeni + " ne postoji. Dodajem ga.");
            skup.add(trazeni);
        }
    }

    public static void ispisiSkup(Set<String> skup) {

        for (String s : skup) {
            System.out.println(s);
        }

        System.out.println();
    }

    public static void obrisiElement(Set<String> skup, String element) {

        if (skup.contains(element)) {
            skup.remove(element);
            System.out.println(element + " je obrisan.");
        } else {
            System.out.println(element + " nije pronađen.");
        }
    }

    public static void main(String[] args) {

        HashSet<String> hashSet = new HashSet<>();
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        TreeSet<String> treeSet = new TreeSet<>();

        popuniSkup(hashSet);
        popuniSkup(linkedHashSet);
        popuniSkup(treeSet);

        provjeriElement(hashSet, "Nema ga");
        provjeriElement(linkedHashSet, "Nema ga");
        provjeriElement(treeSet, "Nema ga");

        System.out.println("HashSet:");
        ispisiSkup(hashSet);

        System.out.println("LinkedHashSet:");
        ispisiSkup(linkedHashSet);

        System.out.println("TreeSet:");
        ispisiSkup(treeSet);

        System.out.println("Ponovni unos elementa 'Nema ga':");

        hashSet.add("Nema ga");
        linkedHashSet.add("Nema ga");
        treeSet.add("Nema ga");

        ispisiSkup(hashSet);

        obrisiElement(hashSet, "PHP");

        System.out.println("Nakon brisanja:");

        ispisiSkup(hashSet);
    }
}