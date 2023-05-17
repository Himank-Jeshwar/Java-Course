import java.util.*;
class PR_18_FibonacciAndSumOfDigits {
    static void generateFibonacci(){
        int a = 0,b = 1,c = 0;
        for (int i = 0;i<=10;i++){
            System.out.print(a+" ");
            c = a+b;
            a=b;
            b=c;
        }
    }

    static int sumOfDigits(int n){
        int sum = 0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
    public static void main(String[] args) {
        int ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("User's Choice:\n1 - Generate Fibonacci\n2 - Sum of digits");
        ch = sc.nextInt();

        switch(ch){
            case 1:
                generateFibonacci();
                break;
            case 2:
                int n,s=0;
                System.out.print("Enter number : ");
                n = sc.nextInt();
                s=sumOfDigits(n);
                System.out.println("Sum of digits = "+s);
                break;
            default:
                System.out.println("Invalid Choice!");
        }
        sc.close();
    }    
}
