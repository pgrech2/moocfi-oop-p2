package ex14StudentsSortedByName;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Classroom {

    private List<Student> students = new ArrayList<>();

    public void add (Student student) {
        if (!this.students.contains(student)) {
            this.students.add(student);
        }
    }

    public void alphabetize() {
        Collections.sort(this.students, Collections.reverseOrder());
    }

    public void print () {
        for (Student student : students) {
            System.out.println(student.toString());
        }
    }
}
