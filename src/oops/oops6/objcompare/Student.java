package oops.oops6.objcompare;

public class Student implements Comparable<Student>{
    int roll;
    float marks;

    public Student(int roll, float marks) {
        this.roll = roll;
        this.marks = marks;
    }


    @Override
    public int compareTo(Student o) {
        return Float.compare(this.marks, o.marks);
        //ifm diff=0, both equal
        //if diff=1, old(o) bigger, else marks is small
    }
}

