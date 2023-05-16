// import java.util.Scanner; -> Imports only Scanner class from java.util package
// import java.util.*; -> Imports all classes from java.util package
class SampleProgram{
    public static void main(String[] args) {
        // Scanner sc = new Scanner (System.in);
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter a value - ");
        int a = sc.nextInt();

        System.out.println(a+5);
    }
}