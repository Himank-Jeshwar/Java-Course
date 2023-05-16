import java.util.*;
class PR_33_GetFibElement {
    public static void main(String[] args) {
        int a=0,b=1,c=0,n;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value for n : ");
        n = sc.nextInt();

        for (int i = 0;i<n;i++){
            c = a+b;
            a=b;
            b=c;
        }
        System.out.println("fib("+n+") = "+a);
    }
} 