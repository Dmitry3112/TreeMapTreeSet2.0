import java.util.Comparator;
import java.util.StringTokenizer;
public class ComparatorSurnameAndAgePerson implements Comparator<Person> {
    private int maxValue;
    public ComparatorSurnameAndAgePerson(int maxValue) {
        this.maxValue = maxValue;
    }
    @Override
    public int compare(Person o1, Person o2) {
        StringTokenizer st1 = new StringTokenizer(o1.getSurname());
        StringTokenizer st2 = new StringTokenizer(o2.getSurname());
        if (st1.countTokens() >= maxValue || st2.countTokens() >= maxValue) {
            if (st1.countTokens() < st2.countTokens()) {
                return -1;
            } else if (st1.countTokens() > st2.countTokens()) {
                return 1;
            }
        }
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}