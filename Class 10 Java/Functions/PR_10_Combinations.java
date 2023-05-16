import java.util.*;
class PR_10_Combinations{
    int factorial(int n){
        int f = 1;
        for (int i = 1;i<=n;i++){
            f*=i;
        }
        return f;
    }
    public static void main(String[] args) {
        int n,fact;// declaration
        PR_10_Combinations comb = new PR_10_Combinations();

        // input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of digits : ");
        n = sc.nextInt();
        
        // number of combinations with no repetition
        fact = comb.factorial(n);

        // printing
        System.out.println("Number of "+n+"-digit numbers that can be made with no repitition : "+fact);
    }
}