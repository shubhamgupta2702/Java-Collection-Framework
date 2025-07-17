import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Arraylist {
    public static void main(String[] args){
        System.out.println("Hello World");
        List<Integer> list = new ArrayList<>();

        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(45);
        arr.add(4);
        arr.add(455);
        arr.add(74);
        arr.add(14);

        Collections.sort(arr);

        System.out.println(arr.contains(45));

        System.out.println(arr.get(2));

        arr.set(2,999);
        System.out.println(arr.get(2));

        System.out.println(arr);

        list.add(10);
        list.add(40);
        list.add(20);

        Collections.sort(list);


//        System.out.println(list.get(2));

//        for(int num:list){
//            System.out.println(num);
//        }
    }
}
