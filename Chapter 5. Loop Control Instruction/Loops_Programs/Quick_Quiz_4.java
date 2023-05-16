package Loops_Programs;
import java.util.Scanner;
public class Quick_Quiz_4 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("Print First n natural numbers in reversed order");
        System.out.print("Enter the value of n (Natural Number) = ");
        int n = user.nextInt();
        if (n<=0){
            System.out.println("ENTER ONLY NATURAL NUMBERS !");
        }
        else {
            for (int y = n ; y>=1 ; y--){
                System.out.println(y);
            }
        }
    }
}

