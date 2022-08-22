package Java_seminar.oop.seminar1;

/*public class Link {

    private Person personFirst;
    private Person personSecond;
    private Relation link;

    public Link(Person personFirst, Person personSecond, Relation link) {
        this.personFirst = personFirst;
        this.personSecond = personSecond;
        this.link = link;
    }

    public Person getPersonFirst() {
        return personFirst;
    }

    public Person getPersonSecond() {
        return personSecond;
    }

    public Relation getLink() {
        return link;
    }

    @Override
    public String toString() {
        return "Link{" +
                "personFirst=" + personFirst +
                ", personSecond=" + personSecond +
                ", link=" + link +
                '}';
    }
}*/

public enum Link {
    CHILD("Child"),
    BROTHER("Brother"),
    SPOUSE("Spouse"),
    UNKNOWN("Unknown"),
    MOTHER("Mother"),
    FATHER("Father"),
    ADOPTED("Adopted");

    private String title;

    Link(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

}