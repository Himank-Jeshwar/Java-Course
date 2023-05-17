import java.util.*;
class PR_08_DisplayNextPrime {
    boolean isPrime(int n){
        for (int i = 2;i<=n/2;i++){
            if (n%i==0&&i!=2)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int n;
        PR_08_DisplayNextPrime obj = new PR_08_DisplayNextPrime();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        n = sc.nextInt();
        
        if (obj.isPrime(n)){
            System.out.println("Prime Number");
            System.exit(0);
        }
        
        while(!(obj.isPrime(n))){
            n++;
        }

        System.out.println("Next Prime Number : "+n);
        sc.close();
    }
}
