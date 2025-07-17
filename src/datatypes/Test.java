package datatypes;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();  //new object is created in memory by new keyword.
        student.name = "Shubham Gupta";
        student.rollNumber = 15;
        student.address = "Madhuban";
        student.standard = 9;
        System.out.println(student.address);
    }
}
