package StringsStringBuilder;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name = "Shubham Gupta";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase()); // we are creating a new one every time.
        System.out.println(name);//original one did not changes.

        System.out.println(name.indexOf('G'));
        System.out.println(name.charAt(10));

        System.out.println("     hindiEnglish   ".trim().toLowerCase());
    }
}
