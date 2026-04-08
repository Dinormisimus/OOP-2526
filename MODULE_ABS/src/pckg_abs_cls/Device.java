package pckg_abs_cls;

public abstract class Device {

    protected String manufacturer;
    protected String model;
    protected int id;
    private int cntID = 1;

    protected Device(String manufacturer, String model){
        this.id = cntID++;
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public void getMainInfo(){
        System.out.println("Model: " + model);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Device id: " + id);
    }

    public abstract void operate();
}
