package pckg_uml_abs;

public class TestClient {
    public static void main(String[] args){
        SportGPMotor mot1 = new SportGPMotor("Ducati","H1000");
        SportCar spc = new SportCar("Mercedes", "SLK");
        SportCar spc2 = new SportCar("Toyota", "RAV4");
        SportCar spc3 = new SportCar("Mercedes", "SLK");
        SuperBike sb = new SuperBike("Yamaha","xyz");
        mot1.startVeh();
        mot1.stopVeh();

        sb.startVeh();
        sb.stopVeh();
        sb.vehInfo();


    }
}
