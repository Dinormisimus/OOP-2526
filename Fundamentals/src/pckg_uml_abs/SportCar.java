package pckg_uml_abs;

public class SportCar extends VehCommon{


    public SportCar(String brand, String model) {
        super(brand, model);
    }

    @Override
    protected void changeTires() {
        System.out.println("Chaning 4 tires!!");
    }

    @Override
    public void startVeh() {
        System.out.println("Starting..." + model);
    }

    @Override
    public void stopVeh() {
        System.out.println("Stopping..." + model);
    }

    @Override
    public void vehInfo() {
        System.out.println(this.toString());
    }
}
