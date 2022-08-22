package Java_seminar.oop.seminar1;

/*import java.util.List;

public class Reserch {
    public static void printParent(String name, Tree tree) {
        List<Link> links = tree.getLinks();

        for (Link el : links) {
            if (el.getPersonFirst().getName().equals(name) &&
            el.getLink() == Relation.CHILD) {
                System.out.println(el.getPersonSecond());
            }
        }
    }
}*/
import java.util.List;
import java.util.Objects;

import Java_seminar.oop.seminar1.Person;

public class Reserch {

    public static void showAllRelations(String fullName, List<Person> tree) {

        for (Person person: tree) {

            if(Objects.equals(person.toString(), fullName)) {

                System.out.printf("%s has:\n", fullName);
                for (var item: person.getLinks().entrySet()) {
                    System.out.printf("%s %s\n", item.getKey().toString(), item.getValue().getTitle());
                }

            }
        }
    }
    public static void showChildren(String fullName, List<Person> tree) {

        for (Person person: tree) {

            if(Objects.equals(person.toString(), fullName)) {

                System.out.printf("Child of %s:\n", person.toString());
                for (var item: person.getLinks().entrySet()) {

                    if (Objects.equals(item.getValue().getTitle(), Link.CHILD.getTitle())) {

                        System.out.printf("%s\n", item.getKey().toString());
                    }
                }
            }
        }
    }
}