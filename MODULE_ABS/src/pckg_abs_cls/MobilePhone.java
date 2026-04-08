package pckg_abs_cls;

public class MobilePhone extends Device{

    protected MobilePhone(String manufacturer, String model) {
        super(manufacturer, model);
    }

    @Override
    public void operate() {
        System.out.println(this.getClass().getSimpleName() + " operates as normal mobile phone does!");
    }
}
