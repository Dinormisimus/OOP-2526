import java.util.*;

public class CounterService {
    private int value = 0;
    private final List<OnChange> listeners = new ArrayList<>();

    @FunctionalInterface
    public interface OnChange {
        void changed(int newValue);
    }

    public void inc() {
        value++;
        // Radimo kopiju liste kako bi izbjegli greške pri modifikaciji u hodu
        for (OnChange l : new ArrayList<>(listeners)) {
            l.changed(value);
        }
    }

    public int getValue() {
        return value;
    }

    public Subscription subscribe(OnChange l) {
        listeners.add(l);
        return new Subscription(l);
    }

    public class Subscription {
        private final OnChange l;
        private boolean active = true;

        private Subscription(OnChange l) {
            this.l = l;
        }

        public void unsubscribe() {
            if (!active) return;
            listeners.remove(l);
            active = false;
        }
    }
}