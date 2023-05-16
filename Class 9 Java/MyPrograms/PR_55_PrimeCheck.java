import java.util.*;
class PR_55_PrimeCheck {
    static boolean isPrime(int n){
        // time complexity = O(sqrt(n))
         for (int i = 2;i<=(int)Math.sqrt(n);i++){
            if (n%i==0)
                return false;
        }
        return true;
        // if ((n*n-1)%24==0)
            // return true;
        // return false;
    }
    public static void main(String[] args) {
        System.out.println("Prime numbers between 100 and 200");
        for (int i = 100,n = 1;i<=150;i++){
            if (isPrime(i)){
                System.out.println(n+". "+i);
                n++;
            }
        }
    }

}
