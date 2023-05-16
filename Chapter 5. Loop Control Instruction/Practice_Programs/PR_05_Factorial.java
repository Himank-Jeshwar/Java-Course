// Factorial of x = 1 x 2 x 3 x 4 .... x
import java.util.Scanner;
public class PR_05_Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to find its factorial = ");
        int x = sc.nextInt();
        int factorial = 1;
        for (int f = 1;f<=x;f++){
            factorial*=f;
        }
        System.out.println("Factorial of "+x+" = "+factorial);
    }
}
