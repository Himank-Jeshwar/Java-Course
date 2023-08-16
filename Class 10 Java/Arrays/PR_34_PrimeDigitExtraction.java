import java.util.*;
class PR_34_PrimeDigitExtraction {
    boolean isPrime(int n){
        for (int i = 2;i<=n/2;i++)
            if (n%i==0&&n!=2)
                return false;
        return (n!=1&&n!=0)?true:false;
    }
    public static void main(String[] args) {
        int low,max = 0,n,copy,s=0,p=1;
        PR_34_PrimeDigitExtraction ob = new PR_34_PrimeDigitExtraction();
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a number : ");
        n = sc.nextInt();
        copy = n;
        low = copy%10; // initializing lowest

        while (copy>0){
            if (copy%10<low)
                low = copy%10;
            if (copy%10>max)
                max = copy%10;
                
            if (ob.isPrime(copy%10)==true)
                s+=copy%10;
            p*=copy%10;
            copy/=10;            
        }

        System.out.println("Lowest digit : "+low);
        System.out.println("Greatest digit : "+max);
        System.out.println("Sum of Prime digits : "+s);
        System.out.println("Product of digits of number : "+p);
    }    
}
