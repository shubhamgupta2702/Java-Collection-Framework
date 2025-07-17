package StringsStringBuilder;

public class Performance {
    public static void main(String[] args) {
        String series ="";


        for(int i = 0; i < 26;i++){
            char ch = (char)('a'+i);
            series += ch;  //creating new objects everytime.
            //Strings are immutable. everytime new objects are created.
        }
        System.out.println(series);
        System.out.println("a"+'c');  // string + anything => string
    }
}
