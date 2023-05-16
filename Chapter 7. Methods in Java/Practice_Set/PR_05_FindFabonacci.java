public class PR_05_FindFabonacci {
    static int fibonacci(int n){
        if (n==0)
            return 0;
        else if (n==1)
            return 1;
        else
            return fibonacci(n-1)+fibonacci(n-2);
    }
    public static void main(String[] args) {
        int x = 4;
        System.out.print(x+"th term in fibonacci series = "+fibonacci(x));
    }
}
