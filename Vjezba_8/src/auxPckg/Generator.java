package auxPckg;

import java.util.concurrent.ThreadLocalRandom;

public class Generator {

    public static int genAge2Guess(int org, int plateau) {

        return ThreadLocalRandom.current().nextInt(org, plateau + 1);
    }
}