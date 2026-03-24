package pckg_uml;

import java.text.SimpleDateFormat;

public class Vehicle {
    protected String model;
    protected String brand;
    protected String date;
    protected int vehID;
    protected static int autoInc = 10;

    public Vehicle(){

    }
    public Vehicle(String model, String brand, SimpleDateFormat date, int vehID, int autoInc){
        this.brand = brand;
        this.model = model;
        this.vehID = autoInc++;
    }

    public Vehicle(String model, String brand) {
    }

    public void setDate(String stringDate){
        this.date = stringDate;
    }
    public void startVehicle(){
        System.out.println("Startong: " + this.getClass().getSimpleName());
    }
    public void stopVehicle(){
        System.out.println("Stop: " + this.getClass().getSimpleName());
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", date='" + date + '\'' +
                ", vehID=" + vehID +
                '}';
    }
    public void vehicleInfo(){
        System.out.println(this.toString());
    }

}
