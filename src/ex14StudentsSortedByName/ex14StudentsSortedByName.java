package ex14StudentsSortedByName;

public class ex14StudentsSortedByName {

    public static void main (String [] args) {
        System.out.println("Example 14:");

        Classroom classroom = new Classroom();
        classroom.add(new Student("b"));
        classroom.add(new Student("a"));
        classroom.add(new Student("d"));
        classroom.add(new Student("c"));

        System.out.println("Students: ");
        classroom.print();

        classroom.alphabetize();

        System.out.println("Alphabetized Students");
        classroom.print();


    }
}
