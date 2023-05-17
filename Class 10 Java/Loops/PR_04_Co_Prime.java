import java.util.*;
class PR_04_Co_Prime {
    int hcf (int a,int b){
        for (int i = a*b;i>=1;i--){
            if (a%i==0&&b%i==0)
                return i;
        }
        return 1;
    }
    public static void main(String[] args) {
        int a,b;
        PR_04_Co_Prime coPrime = new PR_04_Co_Prime();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        a = sc.nextInt();
        b = sc.nextInt();

        if (coPrime.hcf(a,b)==1)
            System.out.println("They are co-prime");
        else
            System.out.println("They are not co-prime");
        
        sc.close();
    }
}
