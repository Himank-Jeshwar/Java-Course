package Loops_Programs;
import java.util.Scanner;
public class Quick_Quiz_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Value of n (Natural Number) = ");
        int num = sc.nextInt();
        int n = 1;
        if (num<=0)
            System.out.println("This is not a natural number. ");
        else {
            do {
                System.out.println(n);
                n++;
            }while(n<=num);
        }
    }   
}
