import java.util.*;
class PR_13_AbundantNumber {
    public static void main(String[] args) {
        int n,sum=0;
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter number : ");
        n = sc.nextInt();

        for (int i = 1;i<n;i++){
            if (n%i==0)
                sum+=i;
        }

        if (sum>n)
            System.out.println("It is an abundant number");
        else
            System.out.println("It is not an abundant number");
        sc.close();
    }    
}
