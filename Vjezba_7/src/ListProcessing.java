import java.util.LinkedList;
import java.util.ListIterator;

public class ListProcessing {

    public static void insertVeh(LinkedList<String> vehicles, String newVehicle) {

        ListIterator<String> itr = vehicles.listIterator();

        while (itr.hasNext()) {

            String vehicle = itr.next();

            System.out.println(vehicle);

            if (vehicle.equals("electronic bike")) {

                itr.add(newVehicle);
            }
        }
    }
}