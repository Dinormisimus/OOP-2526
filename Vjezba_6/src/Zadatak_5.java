import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class LengthStrComparator implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {

        if (s1.length() > s2.length()) {
            return 1;
        } else if (s1.length() < s2.length()) {
            return -1;
        } else {
            return 0;
        }
    }
}

public class Zadatak_5 {

    public static void main(String[] args) {

        ArrayList<String> lst = new ArrayList<>();

        lst.add("auto");
        lst.add("svemirski brod");
        lst.add("avion");
        lst.add("helikopter");
        lst.add("jedrilica");
        lst.add("gliser");
        lst.add("romobil");
        lst.add("bicikla");

        System.out.println("Bez sortiranja:");

        for (String s : lst) {
            System.out.println(s);
        }

        Collections.sort(lst);

        System.out.println("\nSortirano abecedno:");

        for (String s : lst) {
            System.out.println(s);
        }

        Collections.sort(lst, new LengthStrComparator());

        System.out.println("\nSortirano po duljini:");

        for (String s : lst) {
            System.out.println(s);
        }
    }
}