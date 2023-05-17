import java.util.*;
class PR_12_SpecialTwoDigit{
    public static void main(String[] args) {
        int n,sum=0,product=1,copy;
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter number : ");
        n = sc.nextInt();

        if (!(n>=10&&n<=99)){
            System.out.println("Not a 2-digit number");
            System.exit(0);
        }

        copy=n;
        while(copy>0){
            sum+=copy%10;
            product*=copy%10;
            copy/=10;
        }

        if (sum+product==n)
            System.out.println("Special two-digit number");
        else
            System.out.println("Not a special two-digit number");
        sc.close();
    }
}