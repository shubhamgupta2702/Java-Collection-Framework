package datatypes;

public class Stringdatatypes {
    public static void main(String[] args) {
        // two ways of strings declaration.


        String a = new String("Shubham"); // a,b points to the memory locations of Ram stored in the heap storage.
        String b = new String("Shubham");

        String c = "Ram";  // c,d points to the memory locations of Ram stored in the stringpool.
        String d = "Ram";

        System.out.println(a == b); //  checking reference or memory locations.(not checking equality)

//        System.out.println(c == d);  -> true because do not allocate new memory.java points same memory location.

//        System.out.println(a==b);  -> false because diffrent locations in heap storage. allocates new memory in heap.

    }
}
