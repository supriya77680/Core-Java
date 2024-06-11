package comparable_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentList {

    public static void main(String[] args) {

        List<Student> student = new ArrayList<>();
        student.add(new Student("Supriya", 95,98, 92));
        student.add(new Student("Ganesh", 98, 78, 90));
        student.add(new Student("Jayesh", 94, 89, 82));
        student.add(new Student("Naushad", 98, 81, 79));
        student.add(new Student("Vijaya", 93, 90, 94));
        student.add(new Student("Atarva", 92, 90, 87));

        //Collections.sort(student);


        Collections.sort(student,new StudentComparator("math"));
        for(Student std:student){
            System.out.println(std.name+" "+std.maths+" "+ std.english+" " + std.science);
        }
    }
}