import java.util.Comparator;

public class HighbornSurnameComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        int partsSurnameO1 = o1.getSurname().split("-").length;
        int partsSurnameO2 = o2.getSurname().split("-").length;
        int highBorn = 3;
        if (partsSurnameO1 >= highBorn && partsSurnameO2 >= highBorn) {
            return Integer.compare(o1.getAge(), o2.getAge());
        }
        if (partsSurnameO1 > partsSurnameO2) {
            return 1;
        } else if (partsSurnameO1 < partsSurnameO2) {
            return -1;
        } else {
            return Integer.compare(o1.getAge(), o2.getAge());
        }
    }
}
