public class PR_03_Sum {
    static int sum(int n){
        if (n==0)
            return 0;
        else
            return n+sum(n-1);
    }
    public static void main(String[] args) {
        int x = 3;
        System.out.print("Sum of "+x+" natural numbers = "+sum(x));
    }
    
}