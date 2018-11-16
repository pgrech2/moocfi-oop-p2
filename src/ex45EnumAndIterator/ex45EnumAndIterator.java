package ex45EnumAndIterator;

import ex45EnumAndIterator.personnel.Education;
import ex45EnumAndIterator.personnel.Employees;
import ex45EnumAndIterator.personnel.Person;

public class ex45EnumAndIterator {

    public static void main(String [] args) {
        System.out.println("Hello world");

        Person arto = new Person("Arto", Education.D);
        System.out.println(arto);

        Employees university = new Employees();
        university.add(new Person("Matti", Education.D));
        university.add(new Person("Pekka", Education.GRAD));
        university.add(new Person("Arto", Education.D));

        university.print();

        university.fire(Education.GRAD);

        System.out.println("==");

        university.print();
    }
}
