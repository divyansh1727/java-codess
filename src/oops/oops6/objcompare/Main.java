package oops.oops6.objcompare;

import oops.oops6.objcompare.Student;

public class Main {
    public static void main(String[] args) {

        Student ku = new Student(1, 56.55f);
        Student div = new Student(11, 56.33f);

        if (ku.compareTo(div) < 0) {
            System.out.println("div has more marks");
        } else {
            System.out.println("ku has more marks");
        }
    }
}