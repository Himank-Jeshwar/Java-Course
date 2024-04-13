import java.util.*;
class PR_04_Special {
    int factorial(int n){
        int fact = 1;
        for (int i = 1;i<=n;i++)
            fact *= i;
        return fact;
    }
    public static void main(String[] args) {
        int num,s = 0,copy;
        PR_04_Special ob = new PR_04_Special();

        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a number : ");
        num = sc.nextInt();
        copy = num;

        while (copy>0){
            s+=ob.factorial(copy%10);
            copy/=10;
        }

        if (s==num)
            System.out.print("SPECIAL NUMBER");
        else
            System.out.print("NOT A SPECIAL NUMBER");
    }
}
