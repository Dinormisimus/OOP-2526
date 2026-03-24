package pckg_uml_abs;

public class SportGPMotor extends VehCommon{


    protected SportGPMotor(String brand, String model) {
        super(brand, model);
    }

    @Override
    protected void changeTires() {
        System.out.println("Changinh 2 tires!!!");
    }

    @Override
    public void startVeh() {
        System.out.println("Starting..." + this.model);

    }

    @Override
    public void stopVeh() {
        System.out.println("Stopping..." + this.model);

    }

    @Override
    public void vehInfo() {
        System.out.println(this.toString());

    }
}
