package zd_1;

public class VehicleApp {
    public static void main(String[] args) {
        Car car = new Car("Mazda", "3", 2022, 5);
        car.basicInfo();
        car.startEngine();

        Truck truck = new Truck("MAN", "TGX", 2019, 550000);
        truck.basicInfo();
        if (truck.needsService()) {
            truck.performService();
        }

        // Primjer unutarnje klase
        Vehicle.Engine engine = truck.new Engine("Diesel", 500);
        engine.engineDetails();
    }
}
