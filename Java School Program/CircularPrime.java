import java.util.Scanner;
class CircularPrime {
    static int num;
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        num = sc.nextInt();
        sc.close();
    }    

    static boolean isPrime(int n){
        for (int i = 2;i<n;i++){
            if (n%i==0)
                return false;
        }
        return true;
    }
    static int countDigit(int n){
        int digits = 0;
        while(n>0){
            digits++;
            n/=10;
        }
        return digits;
    }
    // 1 
    // 193
    // 
    public static void main(String[] args) {
       
        CircularPrime cp = new CircularPrime();
        cp.input();
        boolean prime = false;
        int divisor = (int)Math.pow(10,countDigit(num)-1);
        int n2 = num;
        // r1,r2;
        
        System.out.println("Numbers are :-");
        for (int i = 1;i<countDigit(num);i++){
            int r1= n2/divisor;
            int r2= n2%divisor;
            n2 = r2*10+r1;
            System.out.println(n2);
            if (isPrime(n2))
                prime = true;
            else{
                prime = false;
                break;
            }
        }
        if (prime)
            System.out.print(num+" is a circular prime number.");
        else
            System.out.print(num+" is not a circular prime number.");
    }
}
