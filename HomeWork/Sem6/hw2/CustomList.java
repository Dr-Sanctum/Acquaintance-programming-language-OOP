package HomeWork.Sem6.hw2;

import java.util.ArrayList;
import java.util.List;

/**
 * Задача 2. Есть два самодельных класса коллекций:
 * 
 * ImmutableList<T> — коллекция, которая никогда ни при каких обстоятельствах не
 * меняется. Методы:
 * • getSize ()
 * • get (int i)
 * 
 * MutableList<T> — коллекция, которая допускает изменения. Методы:
 * • getSize ()
 * • get (int i)
 * • set (int i, T newValue)
 * • add (T newValue)
 * • remove (T value)
 * 
 * Реализуйте такую схему наследования между двумя этими классами,
 * которая будет соответствовать принципу подстановки Лисков.
 */
public abstract class CustomList<T> {
    protected List<T> list = new ArrayList<>();

    public int getSize() {
        return list.size();
    }

    public T get(int index) {
        return list.get(index);
    }
}
