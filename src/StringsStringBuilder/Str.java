package StringsStringBuilder;

public class Str {
    public static void main(String[] args) {
        String name = "Hello";
        String place = new String("Hello");  // creating new objects in heap.


        System.out.println(name.equals(place));  // checks the values
        System.out.println(name == place);  // checks the reference in heap storage.

//        System.out.println(place);
//
//        System.out.println(name);
//        name = "Gupta";  // not changing string. we are creating a new one.

    }
}
