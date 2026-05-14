import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Comparator;

public class Zadatak2 {

    public static void fillList(ArrayList<Integer> list, int brojElemenata) {

        Random rand = new Random();

        for (int i = 0; i < brojElemenata; i++) {
            list.add(rand.nextInt(991) + 10); // 10 - 1000
        }
    }

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        fillList(numbers, 10);

        System.out.println("Originalna lista:");
        System.out.println(numbers);

        // prirodni redoslijed
        Collections.sort(numbers);

        System.out.println("Sortirano uzlazno:");
        System.out.println(numbers);

        // anonimna klasa za obrnuti redoslijed
        Collections.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });

        System.out.println("Sortirano silazno:");
        System.out.println(numbers);
    }
}