package ex29PersonAndTheirHeirs.people;

public class Teacher extends Person{

    private int salary;

    public Teacher(String fullName, String address, int salary) {
        super(fullName, address);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + "\n\tsalary " + this.salary + " euros/month";
    }
}
