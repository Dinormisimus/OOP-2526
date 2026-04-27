package vj_hm;

import java.util.Comparator;

public class HashCodeComparator implements Comparator {

    @Override
    public int compare(Object st1, Object st2) {
        return Integer.compare(st1.hashCode(), st2.hashCode());
    }
}
