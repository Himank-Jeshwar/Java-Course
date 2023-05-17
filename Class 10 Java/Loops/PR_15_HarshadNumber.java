import java.util.*;
class PR_15_HarshadNumber {
    public static void main(String[] args) {
        int n,sum=0,copy;
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter number : ");
        n = sc.nextInt();

        copy = n;
        while(copy>0){
            sum+=copy%10;
            copy/=10;
        }

        if (n%sum==0)
            System.out.println("It is a Harshad Number");
        else
            System.out.println("It is not a Harshad Number");
        sc.close();
    }    
}
