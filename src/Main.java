import java.util.ArrayList;
import java.util.Comparator;
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
        Comparator<Person> highBorn = (o1, o2) -> {
            int partsSurnameO1 = o1.getSurname().split("-").length;
            int partsSurnameO2 = o2.getSurname().split("-").length;
            int highBorn1 = 3;
            if (partsSurnameO1 >= highBorn1 && partsSurnameO2 >= highBorn1) {
                return Integer.compare(o1.getAge(), o2.getAge());
            }
            if (partsSurnameO1 > partsSurnameO2) {
                return 1;
            } else if (partsSurnameO1 < partsSurnameO2) {
                return -1;
            } else {
                return Integer.compare(o1.getAge(), o2.getAge());
            }
        };

        people.sort(highBorn);
        printList(people);
    }

    private static void printList(List<Person> people) {
        for (Person person : people) {
            System.out.println(person.toString());
        }
    }
}
