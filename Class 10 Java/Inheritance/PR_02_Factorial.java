import java.util.*;
class PR_02_Factorial {
    private int n;
    
    void input(){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter number : ");
        n = sc.nextInt();
    }

    void fact(){
        int factorial = 1;
        for (int i = 1;i<=n;i++){
            factorial*=i;
        }
        System.out.println(n+"! = "+factorial);
    }

    public static void main(String[] args) {
        PR_02_Factorial f = new PR_02_Factorial();
        f.input();
        f.fact();
    }
}
