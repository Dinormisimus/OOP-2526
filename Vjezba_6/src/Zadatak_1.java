import java.util.ArrayList;
import java.util.LinkedList;

public class Zadatak_1 {

    public static void zamijeniElement(LinkedList<String> lista, int index, String noviElement) {

        String obrisani = lista.remove(index);
        lista.add(index, noviElement);

        System.out.println("Obrisani element: " + obrisani);
    }

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Java");
        arrayList.add("Python");
        arrayList.add("C++");
        arrayList.add("C#");
        arrayList.add("PHP");

        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.addAll(arrayList);

        System.out.println("ArrayList:");
        System.out.println(arrayList);

        System.out.println("\nLinkedList:");
        System.out.println(linkedList);

        linkedList.add("JavaScript");

        linkedList.addFirst("HTML");
        linkedList.addLast("CSS");

        System.out.println("\nProsirena LinkedList:");

        for (String s : linkedList) {
            System.out.println(s);
        }

        zamijeniElement(linkedList, 4, "SQL");

        System.out.println("\nNakon zamjene:");

        for (String s : linkedList) {
            System.out.println(s);
        }
    }
}