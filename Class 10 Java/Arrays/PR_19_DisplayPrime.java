import java.util.*;
class PR_19_DisplayPrime {
    boolean isPrime(int n){
        for (int i = 2;i<n;i++){
            if (n%i==0&&n!=2)
                return false;
        }        
        return true;
    }    
    public static void main(String[] args) {
        int n[] = new int[6];
        Scanner sc = new Scanner(System.in);
        PR_19_DisplayPrime prime = new PR_19_DisplayPrime();
        System.out.println("Enter 20 numbers : ");        
        for (int i = 0;i<n.length;i++){
            n[i] = sc.nextInt();
        }

        for (int j = 0;j<n.length;j++){
            if (prime.isPrime(n[j]))
                System.out.print(n[j]+" ");
        }
    }
}
