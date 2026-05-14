import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Zadatak_2 {

    public static void ispisiMapu(Map<Integer, String> mapa) {

        for (Integer key : mapa.keySet()) {
            System.out.println("id = " + key + ", Name = " + mapa.get(key));
        }

        System.out.println();
    }

    public static void main(String[] args) {

        HashMap<Integer, String> hashMap = new HashMap<>();

        hashMap.put(21, "Stipe");
        hashMap.put(159, "Divna");
        hashMap.put(985, "Etna");
        hashMap.put(455, "Petar");
        hashMap.put(5788, "Vlatka");

        System.out.println("HashMap:");
        ispisiMapu(hashMap);

        TreeMap<Integer, String> treeMap = new TreeMap<>();

        treeMap.putAll(hashMap);

        System.out.println("TreeMap:");
        ispisiMapu(treeMap);

        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();

        linkedHashMap.put(21, "Stipe");
        linkedHashMap.put(159, "Divna");
        linkedHashMap.put(985, "Etna");
        linkedHashMap.put(455, "Petar");
        linkedHashMap.put(5788, "Vlatka");

        System.out.println("LinkedHashMap:");
        ispisiMapu(linkedHashMap);
    }
}