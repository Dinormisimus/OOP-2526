package vj_hm;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class Test {
    public static void main(String[] args) {
        TreeMap<Student, Integer[]> studenti = new TreeMap<>();

        Student s1 = new Student("Lovre", 22);
        Student s2 = new Student("Kristijan", 23);
        Student s3 = new Student("Lucija", 19);
        Student s4 = new Student("Božena", 18);
        Student s5 = new Student("Luka", 25);
        Student s6 = new Student("Iva",31);

        studenti.put(s1, new Integer[]{2, 3, 3, 3});
        studenti.put(s2, new Integer[]{2, 4, 3, 2});
        studenti.put(s3, new Integer[]{2, 5, 5, 2});
        studenti.put(s4, new Integer[]{2, 1, 4, 3});
        studenti.put(s5, new Integer[]{3, 5, 5, 2});
        studenti.put(s6, new Integer[]{1, 2, 4, 2});

        System.out.println("--- Prva mapa (po ID-u) ---");
        listAllElements(studenti);

        TreeMap<Student, Integer[]> studentiImena = new TreeMap<>(new NameLengthComparator());
        studentiImena.putAll(studenti);

        TreeMap<Student, Integer[]> studentiHashCode = new TreeMap<>(new HashCodeComparator());
        studentiHashCode.putAll(studenti);

        TreeMap<Student, Integer[]> studentiAge = new TreeMap<>(new AgeComparator());
        studentiAge.putAll(studenti);

        System.out.println("\n--- Druga mapa (po godinama) ---");
        listAllElements(studentiAge);

        System.out.println("\n--- Treća mapa (po hashu) ---");
        listAllElements(studentiHashCode);
    }

    // Popravljena sintaksa metode
    private static void listAllElements(TreeMap<Student, Integer[]> tMap) {
        for (Map.Entry<Student, Integer[]> elem : tMap.entrySet()) {
            System.out.println("Key: " + elem.getKey().getName() + " (ID: " + elem.getKey().getId() + ") ");
            System.out.println(" - Age: " + elem.getKey().getAge());
            System.out.println(" - Values: " + Arrays.toString(elem.getValue()));
            System.out.println(" - HashCode: " + elem.getKey().hashCode());
            System.out.println("_____________________________________________");
        }
    }
}