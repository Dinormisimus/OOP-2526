package zd_2;

import java.util.UUID;

public class Person implements CommonAction {
    private String name;
    private int id;
    private static int cnt;

    public Person(String name) {
        this.name = name;
        this.id = ++cnt;
    }

    @Override
    public void walk(String location, int speed) {
        System.out.println("I'm a human, and you can't command to me!");
    }

    @Override
    public void talk(String message) {
        String randomStr = UUID.randomUUID().toString();
        System.out.println("You want me to talk - ok: " + randomStr);
    }

    @Override
    public void think(String thought) {
        System.out.println("Surely, humans are more capable of thinking then robots - aren't they?");
    }

    @Override
    public int calculate(int num) {
        return num % 2;
    }

    public void personInfo() {
        System.out.println("Name: " + name + ", ID: " + id);
    }

    @Override
    public String toString() {
        return "Person: " + name;
    }
}