package ex13RichFirstPoorLast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ex13RichFirstPoorLast {
    public static void main (String [] args) {
        System.out.println("Example 13");
        List<Person> people = new ArrayList<>();
        people.add(new Person("bar", 6));
        people.add(new Person("foo", 5));
        people.add(new Person("bar1", 8));
        people.add(new Person("foo1", 7));


        System.out.println("Not Sorted:");
        for(Person person : people) {
            System.out.println(person.toString());
        }
        System.out.println("\n");

        Collections.sort(people);

        System.out.println("Sort Descending:");
        for(Person person : people) {
            System.out.println(person.toString());
        }
        System.out.println("\n");

        System.out.println("Sort Ascending:");

        Collections.sort(people, Collections.reverseOrder());
        for(Person person : people) {
            System.out.println(person.toString());
        }


    }
}
