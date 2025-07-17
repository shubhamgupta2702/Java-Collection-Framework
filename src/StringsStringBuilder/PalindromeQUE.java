package StringsStringBuilder;

import java.util.Scanner;

public class PalindromeQUE {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string you want to check palindrome:- ");
        String name = in.next();
        boolean ans = isPalindrome(name);
        System.out.println(ans);
    }

    static boolean isPalindrome(String name) {
        if (name == null || name.length() == 0) return true;

        StringBuilder res = new StringBuilder(name);
        String ans = res.reverse().toString();

        if (ans.equals(name)) return true;
        return false;
    }
}
