public class PR_10_TotalUsingLoop {
    static int sum(int n){
        int total = 0;
        for (int i = 1;i<=n;i++){
            total+=i;
        }
        return total;
    }
    public static void main(String[] args) {
        int x = 10;
        System.out.print("Sum of first "+x+" natural numbers = "+sum(x));
    }
    
}