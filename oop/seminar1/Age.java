package oop.seminar1;

import java.util.Comparator;

public class Age implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return Integer.compare(o1.age, o2.age);
    }
}
