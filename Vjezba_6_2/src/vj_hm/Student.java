package vj_hm;

public class Student implements Comparable<Student> {

    private String name;
    private int age;
    private int id;
    private static int cntID = 20;

    public Student(String name, int age) {
        this.name = name;
        this.id = cntID++;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }



    @Override
    public int compareTo(Student other) {
        // Sortiranje po ID-u (prirodni poredak za prvu mapu)
        return Integer.compare(this.id, other.id);
    }
}