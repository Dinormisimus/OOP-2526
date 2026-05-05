package Exceptions;

public class FlyingRobot extends Robot{

    protected FlyingRobot(String name) {
        super(name);
    }

    @Override
    protected void chargeRobot() {
        System.out.println("Charging in the air " + this.getClass().getSimpleName());
    }

    @Override
    protected void changeState() {
        System.out.println("Fly or land!");
    }
}
