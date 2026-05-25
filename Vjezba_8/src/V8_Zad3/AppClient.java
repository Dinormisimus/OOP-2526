package V8_Zad3;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class AppClient {

    public static void main(String[] args) {

        int[] arr = genArr(10);

        try {

            System.out.println(arr[arr.length]);

        } catch (ArrayIndexOutOfBoundsException e) {

            StackTraceElement[] ste = e.getStackTrace();

            System.out.println(
                    "Exception: "
                            + e.getClass().getCanonicalName()
                            + " in: "
                            + ste[0]
            );

        } finally {

            System.out.println("Be careful -> array length is: " + arr.length);
        }
    }

    private static int[] genArr(int arraySize) {

        int[] arr = new int[arraySize];

        int i = 0;

        while(i < arraySize) {

            arr[i] = ThreadLocalRandom.current().nextInt();

            i++;
        }

        System.out.println(Arrays.toString(arr));

        return arr;
    }
}