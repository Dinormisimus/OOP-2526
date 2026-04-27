package zd_2;

public class Robot implements CommonAction {
    private String name;
    private int id;
    private static int cnt;

    public Robot(String name) {
        this.name = name;
        this.id = ++cnt;
    }

    @Override
    public void walk(String location, int speed) {
        // Implementacija po potrebi
    }

    @Override
    public void talk(String message) {
        // Implementacija po potrebi
    }

    @Override
    public void think(String thought) {
        // Implementacija po potrebi
    }

    @Override
    public int calculate(int num) {
        return num * 10; // Primjer robotske kalkulacije
    }

    public void robotInfo() {
        System.out.println("Robot Name: " + name + ", Serial: " + id);
    }

    @Override
    public String toString() {
        return "Robot: " + name;
    }
}
