package Java_seminar.oop.seminar1;

import java.util.List;

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
}