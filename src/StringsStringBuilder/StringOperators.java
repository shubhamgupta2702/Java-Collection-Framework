package StringsStringBuilder;

import java.util.ArrayList;

public class StringOperators {
    public static void main(String[] args) {
        System.out.println('a'+'b');
        System.out.println("a"+"b");

        System.out.println('a'+0);  //ASCII Value

        System.out.println("a"+1);

        System.out.println("abc"+ new ArrayList<>());
    }
}
