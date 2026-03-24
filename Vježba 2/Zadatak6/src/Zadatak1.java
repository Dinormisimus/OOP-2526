import java.util.Arrays;

public class Zadatak1{
    public static void main(String[] args){
        int[] niz1 = new int[15];
        niz1 = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int[] niz2 = Arrays.copyOf(niz1, niz1.length);
        if(Arrays.equals(niz1,niz2)){
            System.out.println("Nizovi su jednaki!");
        }else{
            System.out.println("Nizovi su različiti!");
        }}}
