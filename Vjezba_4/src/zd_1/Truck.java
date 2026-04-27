package zd_1;

public class Truck extends Vehicle implements Maintainable {
    private double mileage;
    private double lastServiceMileage;

    public Truck(String brand, String model, int year, double mileage) {
        super(brand, model, year);
        this.mileage = mileage;
        this.lastServiceMileage = mileage;
    }

    @Override
    public void startEngine() {
        System.out.println("Kamion " + model + ": Diesel motor pokrenut.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Kamion " + model + ": Diesel motor ugašen.");
    }

    @Override
    public void performService() {
        this.lastServiceMileage = this.mileage;
        System.out.println("Servis obavljen na kamionu " + model);
    }

    @Override
    public boolean needsService() {
        return (mileage - lastServiceMileage) > 10000;
    }
}
