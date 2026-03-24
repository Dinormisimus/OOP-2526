package pckg_arr_1;

import java.util.concurrent.ThreadLocalRandom;

public class AUX_CLS {

    private static final int ORIGIN = 0;
    private static final int BOUND = 250;

    public static Student[] genStudentFromNames(String[] names){
        Student[] studenti = new Student[names.length];
        for(int k = 0; k < names.length; k++){
            studenti[k] = new Student(names[k]);
        }
        return studenti;
    }
    public static void printIntFromArray(int[] intArr){
        for(int el : intArr){
            System.out.println(el);
        }
    }

    public static void printStrFromArr(String[] strArr){
        for(String el : strArr){
            System.out.println(el);
        }
    }

    public static void printStudentFromArr(Student[] stud){
        for(Student st : stud){
            System.out.println(st);
        }
    }
    public static <E> void printElementsFromArr(E[] arr){
        for(E element : arr){
            System.out.println(element);
        }
    }
    public static Profesor[] genProfesorFromNames(String[] names){
        Profesor[] profesori = new Profesor[names.length];
        for(int k = 0; k < names.length; k++){
            profesori[k] = new Profesor(names[k]);
        }
        return profesori;
    }
    //public static <E> E[] genObjectsFromNames(String[] names){
    //    E[] elements = new E[names.length];
    //}
}
