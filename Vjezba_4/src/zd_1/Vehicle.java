package zd_1;

public abstract class Vehicle {
    protected String brand;
    protected String model;
    protected int productionYear;

    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.productionYear = year;
    }

    public void basicInfo() {
        System.out.println("Vozilo: " + brand + " " + model + " (" + productionYear + ")");
    }

    public abstract void startEngine();
    public abstract void stopEngine();


public class Engine {
    private String fuelType;
    private int horsePower;

    public Engine(String fuelType, int hp) {
        this.fuelType = fuelType;
        this.horsePower = hp;
    }

    public void engineDetails() {
        System.out.println("Motor: " + fuelType + ", Snaga: " + horsePower + " HP");
    }
}}