package pckg_read_write;

import java.io.Serializable;

public class SpaceShip implements Serializable {
    private String name;
    private int id;
    private static int cntID = 1;

    public SpaceShip(String name) {
        this.name = name;
        this.id = cntID++;
    }

    // Konstruktor koji prima id iz CSV-a
    public SpaceShip(int id, String name) {
        this.name = name;
        this.id = id;
        if (id >= cntID) {
            cntID = id + 1;
        }
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "SpaceShip{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}