package pckg_uml;

public class VehClient {
    private static Vehicle veh;
    private static SportCar sc1;
    private static SportCar sc2;

    public static void main(String[] args){
        veh = new Vehicle("X4","BMW");
        sc1 = new SportCar("Carrera", "Porche");
        sc2 = new SportCar("Spider","Ferrari");
        veh.setDate("23-11-2008");
        veh.vehicleInfo();
        veh.startVehicle();
        sc1.setDate(("05-04-2017"));
        sc1.vehicleInfo();
        sc2.setDate("10-10-2023");
        sc2.vehicleInfo();
        sc2.startVehicle();
    }
}
