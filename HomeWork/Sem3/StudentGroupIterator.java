package HomeWork.Sem3;

import java.util.Iterator;

public class StudentGroupIterator implements Iterator<Student> {
    private int index = -1;
    private StudentGroup studGroup;

    public StudentGroupIterator(StudentGroup studGroup) {
        this.studGroup = studGroup;
    }

    @Override
    public boolean hasNext() {
        return index < studGroup.getSize() - 1;
    }

    @Override
    public Student next() {
        
        return studGroup.getStudent(++index);
    }
    
}
