package HomeWork.Sem3;

import java.util.ListIterator;

public class GroupListIterator implements ListIterator<Student> {

    private int index = -1;
    private StudentGroup studGroup;

    public GroupListIterator(StudentGroup studGroup) {
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

    @Override
    public boolean hasPrevious() {
        
        return index > 0;
    }

    @Override
    public Student previous() {
        
        return studGroup.getStudent(--index);
    }

    @Override
    public int nextIndex() {
        
        return index + 1;
    }

    @Override
    public int previousIndex() {
        return index - 1;
    }

    @Override
    public void remove() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void set(Student e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void add(Student e) {
        // TODO Auto-generated method stub
        
    }

}
