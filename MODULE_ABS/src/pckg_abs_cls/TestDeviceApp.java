package pckg_abs_cls;

public class TestDeviceApp {

    public static void main(String[] args){
        Device mobilePhone = new MobilePhone("Samsung","S26");
        mobilePhone.operate();
        mobilePhone.getMainInfo();

        Device camera = new Camera("Nikon","s45");
        camera.operate();
        camera.getMainInfo();
    }
}
