import java.util.*;
class PR_14_SpyNumber {
    public static void main(String[] args) {
        int n,sum=0,product = 1;
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter number : ");
        n = sc.nextInt();

        while(n>0){
            sum+=n%10;
            product*=n%10;
            n/=10;
        }

        if (sum==product)
            System.out.println("It is a spy number.");
        else
            System.out.println("It is not a spy number.");
        sc.close();
    }    
}
