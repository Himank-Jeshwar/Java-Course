// import java.util.Scanner;

public class PS_01_ErrorsDemo{
    public static void main(String[] args) {
        /*/ Syntax error
        int a = 5,b = 7,c = a+b;
        if a+b<6 
            System.out.print((a+b)" is smaller")
        else
            System.out.print((a+b)+"is bigger");
        */

        /*Logical error
            WAP to calculate take marks of 3 subjects and print average marks.
         */

        // double m1,m2,m3,avg = 0.0;
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter marks of 3 subjects = ");
        // m1 = sc.nextDouble();
        // m2 = sc.nextDouble();
        // m3 = sc.nextDouble();
        
        // avg = m1+m2+m3/3; // logical error
        // System.out.println("Average marks = "+avg);

        // Runtime error
        int div = 8/0; // Arithmetic exception
        System.out.println(div);
        }
}