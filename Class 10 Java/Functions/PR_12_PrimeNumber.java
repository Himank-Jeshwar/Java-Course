import java.util.*;
class ASG_3_PrimeNumber{
    int countFactors(int n){
        // declaration
        int c = 0;
        for (int i = 2;i<n;i++){
            if (n%i!=0)
                continue;
            c++;
        }
        return c;
    }
    public static void main(String[] args) {
        int countPrime = 0,m,n; // declaration
        
        // instantiation
        ASG_3_PrimeNumber prime = new ASG_3_PrimeNumber();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter lower limit : ");
        m = sc.nextInt();
        System.out.print("Enter upper limit : ");
        n = sc.nextInt();

        System.out.println("Prime numbers b/w "+m+" and "+n+" are : ");
        for (int i = n;i>=m;i--){
            if (prime.countFactors(i)==0){
                System.out.println(i);
                countPrime++;
            }
        }

        // output
        System.out.println("Number of primes : "+countPrime);
    }
}