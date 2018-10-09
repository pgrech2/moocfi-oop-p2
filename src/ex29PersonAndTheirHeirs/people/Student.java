package ex29PersonAndTheirHeirs.people;

public class Student extends Person{

    private int credits = 0;

    public Student(String fullName, String address) {
        super(fullName, address);
    }

    public void study() {
        this.credits++;
    }

    public int getCredits() {
        return this.credits;
    }

    @Override
    public String toString(){
        return super.toString() + "\n\tcredits " + this.credits;
    }

}
