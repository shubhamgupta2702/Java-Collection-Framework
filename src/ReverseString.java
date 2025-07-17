import java.util.Collections;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String name = in.next();



        for(int i = name.length()-1;i >= 0;i--){
            System.out.print(name.charAt(i));
        }
    }
}
