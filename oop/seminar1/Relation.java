package Java_seminar.oop.seminar1;

import Java_seminar.oop.seminar1.Link;
import Java_seminar.oop.seminar1.Person;

/*public enum Relation {
    PARENT,
    CHILD
}*/
public class Relation {

    private Person person1;

    private Person person2;


    public Relation(Person man1, Person man2, String connection){
        this.person1 = man1;
        this.person2 = man2;
        switch (connection) {
            case "Parent" -> appropriateCategoryParent();
            case "Child" -> appropriateCategoryChild();
            case "Adopted" -> appropriateCategoryAdopted();
            case "Brother" -> appropriateCategoryBrother();
            case "Spouse" -> appropriateCategorySpouse();
        }
    }

    public Person get1(){
        return this.person1;
    }

    public Person get2(){
        return this.person2;
    }

    private void appropriateCategoryParent () {
        if(person1.getAge()>5) {
            if(person1 instanceof Man){
                this.person1.getLinks().put(person2, Link.FATHER);
            } else {
                this.person1.getLinks().put(person2, Link.MOTHER);
            }
            this.person2.getLinks().put(person1, Link.CHILD);
        } else {
            System.out.printf("%s can not be Parent, too young age!\n", person1.toString());
        }
    }

    private void appropriateCategoryChild () {
        if (person1.getAge() - person2.getAge() > 5) {
            person1.getLinks().put(person2, Link.CHILD);
            if (person1 instanceof Man) {
                person2.getLinks().put(person1, Link.FATHER);
            } else {
                person2.getLinks().put(person1, Link.MOTHER);
            }
        } else {
            System.out.printf("%s can not be Parent of %s, the age difference is too small\n", person1.toString(), person2.toString());
        }
    }

    private void appropriateCategoryAdopted () {
        if (person2.getAge() < 18 && person1.getAge() - person2.getAge() >= 16) {
            person1.getLinks().put(person2, Link.ADOPTED);
            if (person1 instanceof Man) {
                person2.getLinks().put(person1, Link.FATHER);
            } else {
                person2.getLinks().put(person1, Link.MOTHER);
            }
        } else {
            System.out.printf("%s can not be Adopted by %s, the age difference is too small\n", person1.toString(), person2.toString());
        }
    }
    private void appropriateCategoryBrother () {
        person1.getLinks().put(person2, Link.BROTHER);
        person2.getLinks().put(person1, Link.BROTHER);
    }
    private void appropriateCategorySpouse () {
        if(person1 instanceof Man && person2 instanceof Woman || person1 instanceof Woman && person2 instanceof Man) {
            person1.getLinks().put(person2, Link.SPOUSE);
            person2.getLinks().put(person1, Link.SPOUSE);
        } else {
            System.out.printf("%s and %s can not be spouses!\n", person1.toString(), person2.toString());
        }
    }
}