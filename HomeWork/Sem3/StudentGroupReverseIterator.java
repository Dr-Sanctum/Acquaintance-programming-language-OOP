package HomeWork.Sem3;

import java.util.Iterator;

public class StudentGroupReverseIterator implements Iterator<Student> {

    private StudentGroup studGroup;
    private int index;

    public StudentGroupReverseIterator(StudentGroup studGroup) {
        this.studGroup = studGroup;
        this.index = studGroup.getSize();
    }

    @Override
    public boolean hasNext() {
        return index > 0;
    }

    @Override
    public Student next() {

        return studGroup.getStudent(--index);
    }

}
