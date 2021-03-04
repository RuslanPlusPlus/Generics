package by.ruslan.generic.launcher;

import by.ruslan.generic.comparator.IdComparator;
import by.ruslan.generic.entity.Student;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<Student>();
        Student s1 = new Student("BSUIR");
        Student s2 = new Student("BSUIR");
        Student s3 = new Student("BSU");
        Student s4 = new Student("BNTU");
        students.add(s3);
        students.add(s2);
        students.add(s4);
        students.add(s1);
        IdComparator idComparator = new IdComparator();
        students.sort(idComparator);
        System.out.println(students);
    }
}
