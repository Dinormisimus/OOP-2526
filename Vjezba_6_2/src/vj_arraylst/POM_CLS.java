package vj_arraylst;

import java.util.ArrayList;

public class POM_CLS {

    public static void addElementToList(ArrayList<String> lst, String addedElement) {
        if (lst == null) {
            System.out.println("List is null - define list!");
        } else if(addedElement == null) {
            System.out.println("Unjeli ste null");
        }else{
            lst.add(addedElement);
            System.out.println("Element added to the list!");
        }
    }
}