import java.util.Arrays;
import java.util.List;

public class Comparator {
    public static void main(String[] args) {

        List<Integer> arr = Arrays.asList(10, 4, 2, 3);
        arr.sort(null);

        for (int i : arr) {
            System.out.print(i + " ");
        }

        List<String> name = Arrays.asList("guava", "banana", "Apple");

//        Collections.sort(name);

        name.sort(null);  //Ascending order - sorting(default)

//      for (String n:name){
//            System.out.println(n);
//        }
    }
}
