import java.util.*;

public class StatPrinter {
    public static void printStats(List<Integer> xs) {
        class Stats {
            int count = 0;
            long sum = 0;
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;

            void accept(int x) {
                count++;
                sum += x;
                min = Math.min(min, x);
                max = Math.max(max, x);
            }

            String finish() {
                if (count == 0) return "Nema elemenata.";
                double avg = (double) sum / count;
                return "count=" + count + ", min=" + min + ", max=" + max + ", avg=" + avg;
            }
        }

        Stats st = new Stats();
        for (int x : xs) {
            st.accept(x);
        }
        System.out.println(st.finish());
    }

    public static void main(String[] args) {
        printStats(Arrays.asList(10, 20, 30, 5, 15));
    }
}