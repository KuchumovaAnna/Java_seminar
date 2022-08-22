package Java_seminar.oop.seminar1;

/*public class App {

    public static void main(String[] args) {
        Person person = new Person("Dima", "V");
        Person person1 = new Person("Oleg", "V");
        Person person2 = new Person("Olga", "V");
        Person person3 = new Person("Irina", "V");
        Person person4 = new Person("Anna", "G");
        Person person5 = new Person("Nikolay", "G");

        Tree tree = new Tree();
        tree.addLink(person1, person, Relation.PARENT, Relation.CHILD);
        tree.addLink(person1, person2, Relation.PARENT, Relation.CHILD);
        tree.addLink(person3, person, Relation.PARENT, Relation.CHILD);
        tree.addLink(person3, person2, Relation.PARENT, Relation.CHILD);
        tree.addLink(person3, person5, Relation.PARENT, Relation.CHILD);
        

        Reserch.printParent("Olga", tree);
    }

}*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Person p1 = new Person("Ivan","A", 32,"man");
        Person p2 = new Person("Ivan","B", 30,"man");
        Person p3 = new Person("Ivan","C", 45,"man");
        Person p4 = new Person("Ivan","D", 28,"man");
        Person p5 = new Person("Ivan","Z", 60,"man");

        List<Person> persons = new ArrayList<>();

        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        persons.add(p4);
        persons.add(p5);

        System.out.println(persons);
        Collections.sort(persons);


        System.out.println(persons);
    }
}