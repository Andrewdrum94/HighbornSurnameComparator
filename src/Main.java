import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Andrew", "Stark-Brown", 38));
        people.add(new Person("Alyosha", "Popov-Bogatyr-Zdorovyak-Russkiy", 15));
        people.add(new Person("Albus", "Persival-Ulfrik-Braian-Dambldor", 15));
        people.add(new Person("John", "Sam-White-Grig", 50));
        people.add(new Person("Nick", "Mitchel-Howard", 25));
        people.add(new Person("James", "Black", 50));
        printList(people);
        System.out.println();
        people.sort(new HighbornSurnameComparator());
        printList(people);
    }

    private static void printList(List<Person> people) {
        for (Person person : people) {
            System.out.println(person.toString());
        }
    }
}
