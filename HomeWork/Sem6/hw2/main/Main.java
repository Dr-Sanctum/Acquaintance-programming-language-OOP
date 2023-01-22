package HomeWork.Sem6.hw2.main;

import HomeWork.Sem6.hw2.*;

public class Main {
    public static void main(String[] args) {

        CustomList<Integer> a1 = new ImmutableList<Integer>();
        CustomList<Integer> a2 = new MutableList<Integer>();
        System.out.println(a1.getSize());
        ((MutableList<Integer>)a2).add(85);
        System.out.println(a2.getSize());

    }
}
