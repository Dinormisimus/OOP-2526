import java.util.concurrent.ArrayBlockingQueue;

public class Zadatak3 {

    public static boolean processElement(ArrayBlockingQueue<Integer> queue, int flag) {

        if (flag == 1) {

            Integer element = queue.poll();

            if (element != null) {
                System.out.println("Obrada elementa: " + element);
                return true;
            } else {
                System.out.println("Red je prazan.");
                return false;
            }

        } else {

            System.out.println("Red je na čekanju.");
            return false;
        }
    }

    public static void addElement(ArrayBlockingQueue<Integer> queue, int element, boolean processed) {

        if (processed) {

            queue.offer(element);
            System.out.println("Dodani novi element: " + element);

        } else {

            System.out.println("Element čeka: " + element);
        }

        System.out.println("Trenutni red: " + queue);
    }

    public static void main(String[] args) {

        ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);

        try {

            queue.add(10);
            queue.add(20);
            queue.add(30);
            queue.add(40);
            queue.add(50);

            System.out.println("Red čekanja:");
            System.out.println(queue);

            // pokušaj dodavanja šestog elementa
            queue.add(60);

        } catch (IllegalStateException e) {

            System.out.println("Ne možete dodati više elemenata od definiranog kapaciteta reda.");
        }

        boolean processed = processElement(queue, 1);

        addElement(queue, 60, processed);
    }
}