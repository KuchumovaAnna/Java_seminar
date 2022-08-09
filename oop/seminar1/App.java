package Java_seminar.oop.seminar1;

public class App {

    public static void main(String[] args) {
        Person person = new Person("Dima", "V");
        Person person1 = new Person("Oleg", "V");
        Person person2 = new Person("Olga", "V");

        Tree tree = new Tree();
        tree.addLink(person2, person, Relation.Mother, Relation.Child);
        tree.addLink(person1, person, Relation.Father, Relation.Child);
        tree.addLink(person2, person1, Relation.Wife, Relation.Husbend);
        tree.addLink(person1, person2, Relation.Husbend, Relation.Wife);
        tree.addLink(person, person2, Relation.Child, Relation.Mother);
        tree.addLink(person, person1, Relation.Child, Relation.Father);
        

        



        Reserch.printAllChildren("Oleg", tree);
    }

}