package oop.seminar1;

import java.util.Comparator;

public class Child implements Comparator<People> {

    @Override
    public int compare(People o1, People o2) {
        return o2.howManyChildren() - o1.howManyChildren();
    }
}