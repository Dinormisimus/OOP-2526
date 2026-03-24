package pckg_arr_1;

public class Profesor {
    private String name;
    private int id;
    private static int cntID = 200;

    public Profesor(String name){
        this.id = cntID++;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
