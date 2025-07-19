package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Collectioninjava {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();

        list2.add(45);
        list2.add(78);
        list2.add(10);
        list2.add(21);

        System.out.println(list2);
        System.out.println(list2.contains(45));

        List<Integer> vector = new Vector<>();
        vector.add(30);
        vector.add(21);
        vector.add(31);

        System.out.println(vector);


    }
}
