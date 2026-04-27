package zd_1;

public class Car extends Vehicle {
    private int doors;

    public Car(String brand, String model, int year, int doors) {
        super(brand, model, year);
        this.doors = doors;
    }

    @Override
    public void startEngine() {
        System.out.println("Automobil " + model + ": Motor pokrenut ključem/gumbom.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Automobil " + model + ": Motor ugašen.");
    }
}
