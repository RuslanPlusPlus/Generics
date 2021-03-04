package by.ruslan.generic.comparator;

import by.ruslan.generic.entity.Person;

import java.util.Comparator;

public class IdComparator implements Comparator<Person> {
    public int compare(Person o1, Person o2) {
        return (int) (o2.getId() - o1.getId());
    }
}
