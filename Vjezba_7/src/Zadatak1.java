import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class DescComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o2.compareTo(o1); // silazno
    }
}

public class Zadatak1 {

    public static void main(String[] args) {

        ArrayList<String> vehicles = new ArrayList<>();

        vehicles.add("auto");
        vehicles.add("svemirski brod");
        vehicles.add("avion");
        vehicles.add("helikopter");
        vehicles.add("jedrilica");
        vehicles.add("gliser");
        vehicles.add("romobil");
        vehicles.add("bicikla");

        Collections.sort(vehicles, new DescComparator());

        System.out.println("Sortirani niz:");
        for (String v : vehicles) {
            System.out.println(v);
        }
    }
}