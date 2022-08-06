package Java_seminar.oop.seminar1;

public class App {

    public static void main(String[] args) {
        Person person = new Person("Dima", "V");
        Person person1 = new Person("Oleg", "V");
        Person person2 = new Person("Olga", "V");

        Tree tree = new Tree();
        tree.addLink(person1, person, Relation.PARENT, Relation.CHILD);
        tree.addLink(person1, person2, Relation.PARENT, Relation.CHILD);


        Reserch.printAllChildren("Oleg", tree);
    }

}