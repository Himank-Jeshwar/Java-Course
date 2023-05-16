import java.util.Scanner;
public class PR_06_Factorial_Using_While_Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to find its factorial = ");
        int num = sc.nextInt();
        int n = num;
        int factorial = 1;
        while (n>=1){
            factorial*=n;
            n--;
        }
        System.out.println("Factorial of "+num+" = "+factorial);
    }
}
