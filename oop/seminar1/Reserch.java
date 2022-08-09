package Java_seminar.oop.seminar1;

import java.util.List;

public class Reserch {
    public static void printAllChildren(String name, Tree tree) {
        List<Link> links = tree.getLinks();

        for (Link el : links) {
            if (el.getPersonFirst().getName().equals(name) &&
            el.getLink() == Relation.PARENT) {
                System.out.println(el.getPersonSecond());
            }
        }
    }
}