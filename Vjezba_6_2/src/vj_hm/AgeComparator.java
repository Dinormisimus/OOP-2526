package vj_hm;

import java.util.Comparator;

public class AgeComparator implements Comparator<Student> {

    @Override
    public int compare(Student st1, Student st2) {
        int res = Integer.compare(st1.getAge(), st2.getAge());

        if (res == 0) {
            return Integer.compare(st1.getId(), st2.getId());
        }
        return res;
    }
}
