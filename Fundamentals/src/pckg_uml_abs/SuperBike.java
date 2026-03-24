package pckg_uml_abs;

class SuperBike extends VehCommon{
    protected SuperBike(String brand, String model) {
        super(brand, model);
    }

    @Override
    protected void changeTires() {

    }

    @Override
    public void startVeh() {
        System.out.println("Starting..." + model);

    }

    @Override
    public void stopVeh() {
        System.out.println("Stopping..." + model + " " + brand);

    }

    @Override
    public String toString() {
        return "SuperBike{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public void vehInfo(){
        System.out.println(this.toString());

    }
}