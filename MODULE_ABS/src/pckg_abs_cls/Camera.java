package pckg_abs_cls;

public class Camera extends Device{

    protected Camera(String manufacturer, String model) {
        super(manufacturer, model);
    }

    @Override
    public void operate() {
        System.out.println(this.getClass().getSimpleName() + " operates as simple digital camera!");
    }

}
