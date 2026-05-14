import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class Zadatak_4 {

    public static void main(String[] args) {

        Robot r1 = new Robot(1, "Flying robot");
        Robot r2 = new Robot(2, "Cleaning robot");
        Robot r3 = new Robot(3, "Thinking robot");
        Robot r4 = new Robot(4, "Humorous robot");
        Robot r5 = new Robot(5, "Friendly robot");
        Robot r6 = new Robot(6, "Weird robot");

        LinkedHashMap<Integer, Robot> mapa = new LinkedHashMap<>();

        mapa.put(r1.getId(), r1);
        mapa.put(r2.getId(), r2);
        mapa.put(r3.getId(), r3);
        mapa.put(r4.getId(), r4);
        mapa.put(r5.getId(), r5);
        mapa.put(r6.getId(), r6);

        mapa.put(r5.getId(), r5);

        LinkedHashSet<Robot> set = new LinkedHashSet<>();

        set.add(r1);
        set.add(r2);
        set.add(r3);
        set.add(r4);
        set.add(r5);
        set.add(r6);

        set.add(r5);

        System.out.println("LinkedHashMap:");

        for (Integer key : mapa.keySet()) {
            System.out.println(mapa.get(key));
        }

        System.out.println("\nLinkedHashSet:");

        for (Robot r : set) {
            System.out.println(r);
        }
    }
}