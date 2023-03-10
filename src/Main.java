import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> person = new ArrayList<>();
        person.add(new Person("Vasiliy", "Pupkin", 23));
        person.add(new Person("Alfred", "Great", 40));
        person.add(new Person("Ragnar", "Lodbrok", 65));
        person.add(new Person("Bjorn", "Ironside", 45));
        person.add(new Person("Ivar", "Boneless", 15));
        person.add(new Person("Ubbe", "Lodbrok", 25));
        Collections.sort(person, new ComparatorSurnameAndAgePerson(3));
        System.out.println(person);
    }
}