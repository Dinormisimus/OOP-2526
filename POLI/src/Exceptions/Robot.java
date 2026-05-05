package Exceptions;

public abstract class Robot {
    private String name;
    private int id;
    private static int cntID = 100;

    protected Robot(String name){
        this.name = name;
        this.id = cntID++;
    }
    protected void turnOn(){
        System.out.println(this.getClass().getSimpleName() + " is turning on!");
    }

    protected void turnOff(){
        System.out.println(this.getClass().getSimpleName() + " is turning off!");
    }

    protected abstract void chargeRobot();
    protected abstract void changeState();

    @Override
    public String toString() {
        return "Robot{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}

