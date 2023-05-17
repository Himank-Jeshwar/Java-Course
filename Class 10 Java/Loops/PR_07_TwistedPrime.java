import java.util.*;

class PR_07_TwistedPrime {
    boolean isPrime(int n){
        for (int i = 2;i<=n/2;i++){
            if (n%i==0&&i!=2)
                return false;
        }
        return true;
    }

    int reverse(int n){
        int rev = 0;
        while(n>0){
            rev = rev*10+(n%10);
            n/=10;
        }
        return rev;
    }
    public static void main(String[] args) {
        int n,rev = 0;
        PR_07_TwistedPrime obj = new PR_07_TwistedPrime();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        n = sc.nextInt();
        rev = obj.reverse(n);
        
        System.out.println(rev);
        if (obj.isPrime(n)&&obj.isPrime(rev))
            System.out.println("Twisted Prime");
        else
            System.out.println("Not Twisted Prime");
        
        sc.close();
    }    
}
