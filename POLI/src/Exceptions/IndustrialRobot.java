package Exceptions;

public class IndustrialRobot extends Robot{

    protected IndustrialRobot(String name) {
        super(name);
    }

    @Override
    protected void chargeRobot() {
        System.out.println("Chargig industrial robot " + this.getClass().getSimpleName());
    }

    @Override
    protected void changeState() {
        System.out.println("Can rotate if needed!");
    }
}
