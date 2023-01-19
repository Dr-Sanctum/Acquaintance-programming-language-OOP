package HomeWork.Sem5.Model;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class AttendanceService implements Iterable<Student> {
    private static List<Student> group = new LinkedList<>();

    public static void addStudent(Student stud) {
        group.add(stud);
    }

    public static void addStudent(String name) {
        group.add(new Student(name));
    }

    public static int getSize() {
        return group.size();
    }

    public static Student getStudent(int index) {
        return group.get(index);
    }

    public static List<Student> getAllStudents() {
        return group;
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator();
    }

    @Override
    public String toString() {

        return group.toString();
    }

}
