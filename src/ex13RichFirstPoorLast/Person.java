package ex13RichFirstPoorLast;

public class Person implements Comparable<Person>{

    private String name;
    private int salary;

    public Person (String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName (){
        return this.name;
    }

    public int getSalary () {
        return this.salary;
    }

    @Override
    public String toString() {
        return this.name + ": " + this.salary;
    }

    @Override
    public int compareTo(Person person) {
        if (person.getSalary() == this.salary) {
            return 0;
        } else if (person.getSalary() > this.salary) {
            return 1;
        } else {
            return -1;
        }
    }
}
