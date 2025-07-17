package datatypes;

import java.util.Scanner;

public class TestString {
    public static void main(String[] args) {
        String name = "Shubham";
        String name2 = "sHubhaM";
        String add = "   Madhuban    ";

        Scanner in = new Scanner(System.in);

        int[] arr = {4,5,7,5,4};
        System.out.println(arr.length);

        String np = "My name is Shubham\t \nGupta";
        System.out.println(np);


        String a = name.toUpperCase();
        int l = name.length();


//        String surname = in.nextLine();

//        char ch = in.next().charAt(0);

//        System.out.println(ch);

//        System.out.println(surname);
//        System.out.println(surname.length());

//        System.out.println(name.charAt(4));
//        System.out.println(name.endsWith("m`"));
//        System.out.println(l);
//        System.out.println(a);

        //Equality Check->

//        System.out.println(name.equals(name2)); //true
//        System.out.println(name.equalsIgnoreCase(name2)); //false


//        System.out.println(add.trim());
//        System.out.println(name.concat(name2));
    }
}
