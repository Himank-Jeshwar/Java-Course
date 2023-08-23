import java.util.*;
class PR_03_FibonacciInArrays{
    boolean isPrime(int n){
        for (int i = 2;i<=n/2;i++){
            if (n%i==0&&n!=2)
                return false;
        }
        return (n!=0&&n!=1)?true:false;
    }
    long factorial(int n){
        int fact = 1;
        for (int i = 1;i<=n;i++){
            fact*=i;
        }
        return fact;
    }
    public static void main(String[] args) {
        int fib[];
        int n,a=0,b=1,c=0;

        PR_03_FibonacciInArrays ob = new PR_03_FibonacciInArrays();
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter number of terms of fibonacci series : ");
        n = sc.nextInt();
        fib = new int [n];

        for (int i = 0;i<n;i++){
            fib[i] = a;
            c = a+b;
            a = b;
            b = c;
        }

        System.out.println("Prime fibonacci numbers are : ");
        for (int i = 0;i<n;i++){
            if (ob.isPrime(fib[i]))
                System.out.println(fib[i]+"! = "+ob.factorial(fib[i]));
        }
    }
}