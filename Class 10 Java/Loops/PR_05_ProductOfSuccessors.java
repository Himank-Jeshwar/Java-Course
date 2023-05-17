import java.util.*;
class PR_05_ProductOfSuccessors {
    public static void main(String[] args) {
        int n,product = 1;
        Scanner sc = new Scanner(System.in);    
        System.out.print("Enter number : ");
        n = sc.nextInt();

        while(n>0){
            if ((n%10)%2==0)
                product*=(n%10+1);
            n/=10;
        }

        System.out.print("Product of successor of even digits : "+product);
        sc.close();
    }    
}
