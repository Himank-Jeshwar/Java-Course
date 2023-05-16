import java.util.Scanner;

public class PR_04_PrimeComposite {
    int countFactors(int n){
        int c = 0;
        for (int i = 2;i<n;i++){
            if (n%i==0)
                c++;
        }
        return c;
    }
    public static void main(String[] args) {
        // declaration
        PR_04_PrimeComposite primeComp = new PR_04_PrimeComposite();
        int n;     

        // inputs
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        n = sc.nextInt();

        // decision
        if (primeComp.countFactors(n)==0)
            System.out.println(n+" is a prime number.");
        else 
            System.out.println(n+" is a composite number.");
    }
}
