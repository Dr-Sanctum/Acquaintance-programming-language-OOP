package HomeWork.Sem6.hw2;

public class MutableList<T> extends CustomList<T> {
    public void set(int index, T newElement) {
        super.list.set(index, newElement);
    }

    public void add(T newElement) {
        super.list.add(newElement);
    }

    public void remove(T delElement) {
        super.list.remove(delElement);
    }
}
