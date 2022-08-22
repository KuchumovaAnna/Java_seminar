package Java_seminar.oop.seminar1;

/*import java.util.ArrayList;
import java.util.List;

public class Tree {
    private List<Link> links = new ArrayList<>();

    public List<Link> getLinks() {
        return links;
    }

    public void addLink(Person p1, Person p2, Relation link1, Relation link2) {
        Link l1 = new Link(p1, p2, link1);
        Link l2 = new Link(p2, p1, link2);

        links.add(l1);
        links.add(l2);
    }
}*/
import java.util.ArrayList;
import java.util.List;

import Java_seminar.oop.seminar1.Person;

/**
 * Идея: описать некоторое количество компонент, например:
 * - модель человека
 * - компонента хранения связей и отношений между людьми:
 *   родитель, ребёнок - классика, но можно подумать и про
 *   отношение, брат, свекровь, сестра и т. д.
 * - компонент для проведения исследований
 * - дополнительные компоненты, например отвечающие за вывод
 *   данных в консоль, загрузку и сохранения в файл,
 *   получение\построение отдельных моделей человека
 *   Под “проведением исследования” можно понимать получение всех
 *   детей выбранного человека.
 */
public class Tree {
    public static void main(String[] args) {

        Person man1 = new Man("John","Lee", 19);
        Person man2 = new Man("Vanya", "Lee", 2);
        Person man3 = new Man("Oleg","Lee", 25);
        Person man4 = new Man("Slava","Lee", 7);
        Person man5 = new Woman("Liza", "Lee", 3);
        Person man6 = new Woman("ALina", "Lee", 29);

        Relation rel1 = new Relation(man1, man2, "Adopted");
        Relation rel2 = new Relation(man4, man3, "Parent");
        Relation rel3 = new Relation(man1, man3, "Brother");
        Relation rel4 = new Relation(man3, man5, "Child");
        Relation rel5 = new Relation(man3, man6, "Spouse");
        Relation rel6 = new Relation(man6, man5, "Child");
        Relation rel7 = new Relation(man4, man6, "Parent");

        List<Person> allPeople = new ArrayList<>();
        allPeople.add(man1);
        allPeople.add(man2);
        allPeople.add(man3);
        allPeople.add(man4);
        allPeople.add(man5);
        allPeople.add(man6);

        Reserch.showChildren("Oleg Lee", allPeople);
        System.out.println(allPeople);
        allPeople.sort(new Child());
        System.out.println(allPeople);

        for (Person person: allPeople) {
            System.out.printf("%s has %d children\n",person.toString(), person.howManyChildren());
        }

    }
}