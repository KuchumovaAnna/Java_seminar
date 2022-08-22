package Java_seminar.oop.seminar1;

/*public class Person {
    private String name;
    private String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}*/

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import Java_seminar.oop.seminar1.Link;

/**
 * Описываем класс человек
 */
public abstract class Person implements Comparable<Person>{

    private String name;
    private String surname;
    private int age;
    private Map<Person, Link> links;

    public Person(String name, String surname, int howOld) {

        this.name = name;
        this.surname = surname;
        this.age = howOld;
        this.links = new HashMap<>();

    }

    public int getAge(){
        return this.age;
    }

    public Map<Person, Link> getLinks() {
        return links;
    }

    public int howManyChildren() {
        int count = 0;
        for (var child: links.entrySet()) {
            if (Objects.equals(child.getValue().getTitle(), Link.CHILD.getTitle())) {
                count++;
            }
            if (Objects.equals(child.getValue().getTitle(), Link.ADOPTED.getTitle())) {
                count++;
            }
        }
        return count;
    }

    @Override
    public String toString() {

        return this.name + " " + this.surname;

    }

    @Override
    public int compareTo(Person o) {
        return this.age - o.age;
    }
}