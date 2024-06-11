package comparable_comparator;

public class Student implements Comparable<Student> {

    String name;
    int maths;
    int english;
    int science;

    public Student(String name, int maths, int english, int science) {
        this.name = name;
        this.maths = maths;
        this.english = english;
        this.science = science;
    }

    public int marks(){
        return maths + english + science;
    }

    @Override
    public int compareTo(Student o) {
       return Integer.compare(this.marks(), o.marks());

    }
}
