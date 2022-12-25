package HomeWork.Sem3;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class StudentGroup implements Iterable<Student>{
    private List<Student> group = new LinkedList<>();

    public void addStudent(Student stud) {
        group.add(stud);
    }

    public void addStudent(String name, LocalDate dateBirstday, float averageRating) {
        group.add(new Student(name, dateBirstday, averageRating));
    }

    public int getSize() {
        return group.size();
    }

    public Student getStudent(int index) {
       return group.get(index);
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(this);
    }

    public ListIterator<Student> listIterator() {
        return new GroupListIterator(this);
    }

    public Iterator<Student> reverceIterator() {
        return new StudentGroupReverseIterator(this);
    }

    @Override
    public String toString() {
       
        return group.toString();
    }
}

