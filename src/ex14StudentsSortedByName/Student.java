package ex14StudentsSortedByName;

public class Student implements Comparable<Student>{

    private String name;

    public Student (String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "Name: " + this.name;
    }

    @Override
    public int compareTo(Student student){
        return student.getName().compareToIgnoreCase(this.name);
    }
}
