package vj_arraylst;

import java.util.ArrayList;
import java.util.LinkedList;

public class Test {
    public static void main(String[] args){
        ArrayList<String> lst = new ArrayList<>();
        POM_CLS.addElementToList(lst, "Prvi");
        POM_CLS.addElementToList(lst, "Drugi");
        POM_CLS.addElementToList(lst, "Treći");
        POM_CLS.addElementToList(lst, "Četvrti");
        POM_CLS.addElementToList(lst, "Peti");
        System.out.println(lst);
        LinkedList<String> vezana = new LinkedList<>(lst);
        System.out.println(vezana);
        vezana.addLast("Šesti");
        lst.addFirst("Šesti");
        if (vezana.hashCode() == lst.hashCode()){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        System.out.println(vezana.hashCode());
        System.out.println(lst.hashCode());

        vezana.addFirst("Na prvi");
        vezana.addLast("Na zadnji");
        vezana.add(3,"NEW with index position");
        System.out.println(vezana);
        vezana.remove(3);
        vezana.add(3,"A kaj buš");
        System.out.println(vezana);
    }
}
