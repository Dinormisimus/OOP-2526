import java.util.Iterator;
import java.util.LinkedList;

public class Zadatak5 {

    public static void printList(LinkedList<String> vehicles) {

        for (String vehicle : vehicles) {
            System.out.println(vehicle);
        }
    }

    public static void main(String[] args) {

        LinkedList<String> vehicles = new LinkedList<>();

        vehicles.add("car");
        vehicles.add("helicopeter");
        vehicles.add("electronic bike");
        vehicles.add("truck");
        vehicles.add("motorcycle");
        vehicles.add("carriage");

        System.out.println("Originalna lista:");
        printList(vehicles);

        System.out.println("\nIspis preko iteratora:");

        Iterator<String> itr = vehicles.iterator();

        while (itr.hasNext()) {

            String vehicle = itr.next();

            System.out.println(vehicle);

            if (vehicle.equals("carriage")) {

                itr.remove();
            }
        }

        System.out.println("\nLista nakon brisanja carriage:");
        printList(vehicles);

        System.out.println("\nListIterator obrada:");

        ListProcessing.insertVeh(vehicles, "scooter");

        System.out.println("\nLista nakon umetanja:");
        printList(vehicles);
    }
}