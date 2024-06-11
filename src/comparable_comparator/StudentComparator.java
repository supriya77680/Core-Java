package comparable_comparator;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
    private String subject;

    // Constructor
    public StudentComparator(String subject) {
        this.subject = subject;
    }

    @Override
    public int compare(Student o1, Student o2) {
        switch (subject) {
            case "math":
                return Integer.compare(o2.maths, o1.maths);
            case "science":
                return Integer.compare(o1.science, o2.science);
            case "english":
                return Integer.compare(o1.english, o2.english);
            default:
                throw new IllegalArgumentException("Invalid subject: " + subject);
        }
    }
}
