
package HomeWork.Sem3;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.ListIterator;


/**
 * main
 */
public class main {

    public static void main(String[] args) {

        Student a = new Student("Вася", LocalDate.of(2000, 1, 12), 2.5f);
        Student b = new Student("Петя", LocalDate.of(2001, 2, 8), 1.3f);
        Student c = new Student("Ирина", LocalDate.of(1993, 3, 7), 25f);
        Student d = new Student("Люцифер", LocalDate.of(1600, 4, 5), 3.2f);

        StudentGroup studentGroup = new StudentGroup();
        studentGroup.addStudent(a);
        studentGroup.addStudent(b);
        studentGroup.addStudent(c);
        studentGroup.addStudent(d);

        for (Student student : studentGroup) {
            System.out.println(student);
        }

        System.out.println("--------------------------------------------------");

        ListIterator listiterator = studentGroup.listIterator();

        System.out.println(listiterator.next());
        System.out.println(listiterator.next());
        System.out.println(listiterator.previous());
        System.out.println(listiterator.hasPrevious());
        System.out.println(listiterator.hasNext());

        System.out.println("--------------------------------------------------");

        Iterator rIterator = studentGroup.reverceIterator();

        while (rIterator.hasNext()) {
            System.out.println(rIterator.next());
        }

    }
}