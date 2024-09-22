import java.util.*;
class PR_03_Goldbach {
    int n;

    void input (){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        n = sc.nextInt();

        if (n>9&&n<50 == false || n%2!=0){
            System.out.println("Invalid Input !");
            System.exit(0);
        }
    }

    boolean isOddPrime(int num){

        for (int i = 2;i<=num/2;i++){
            if (num%i==0)
                return false;
            }    
            
        return (num!=1 && num!=0)?true:false;
        
    }

    void findOddPrimes(){
        int copy = n;

        System.out.println("PRIME PAIRS ARE : ");
        for (int i = 0;i<=n;i++){
            if (isOddPrime(i)&&isOddPrime(copy))
                System.out.println(i+", "+copy);
            
            if (copy==n/2)
                break;
            copy--;
            
        }
    }
    public static void main(String[] args) {
        PR_03_Goldbach ob = new PR_03_Goldbach();
        ob.input();
        ob.findOddPrimes();
    }    
}
