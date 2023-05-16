import java.util.Scanner;
public class CWH_06_Fibonacci_Number {
    // Formula - fib(n-1)+fib(n-2)

    static int fib(int n){
        if (n==0)
            return 0;
        else if (n==1)
            return 1;
        else
            return fib(n-1)+fib(n-2);   
    }

        public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number = ");
        num = sc.nextInt();
        for (int i = 0;i<=num;i++){
            System.out.println(fib(i));
        }
    } 
}
