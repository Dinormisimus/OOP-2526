package zd_1;

public class Motorcycle extends Vehicle {
    public Motorcycle(String brand, String model, int year) {
        super(brand, model, year);
    }

    @Override
    public void startEngine() {
        System.out.println("Motor " + model + ": Motor pokrenut nožnim startom ili gumbom.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Motor " + model + ": Motor ugašen prekidačem.");
    }
}
