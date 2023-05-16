public class CWH_05_Recursion {
    // factorial (n) = n*factorial(n-1)
    static int factorial(int n){
        if (n==0||n==1)
            return 1;
        return n*factorial(n-1);
    }
    // n = first 10 natural numbers
    // sum(n) = 10+9+8+7+6+5+4+3+2+1 = 55
    // n+sum(n-1)

    static int total(int x){
        if (x==0)
            return 0;
        return x+total(x-1);
    }
    public static void main(String[] args) {
        System.out.println("Sum of first 10 natural numbers = "+total(10));
        System.out.println("Factorial of 5 = "+factorial(5));
    }
}
