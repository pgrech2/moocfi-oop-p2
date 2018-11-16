package ex45EnumAndIterator.personnel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {

    private List<Person> persons;

    public Employees() {
        persons = new ArrayList<>();
    }

    public void add(Person person) {
        persons.add(person);
    }

    public void add(ArrayList<Person> persons) {
        if (!persons.isEmpty()) {
            this.persons.addAll(persons);
        }
    }

    public void fire(Education education) {
        Iterator<Person> iterator = persons.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getEducation() == education) {
                iterator.remove();
            }
        }
    }

    public void print() {
        Iterator<Person> iterator = persons.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void print(Education education) {
        for (Person person : persons) {
            if (person.getEducation() == education) {
                System.out.println(person);
            }
        }
    }
}
