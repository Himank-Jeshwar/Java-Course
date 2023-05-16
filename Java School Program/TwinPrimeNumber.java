import java.util.Scanner;
class TwinPrimeNumber {
    static boolean isPrime(int n){
        int factors = 0;
        for (int i = 2;i<n;i++){
            factors = (n%i==0)?factors+1:factors+0;
        }
        return (factors==0)?true:false;
    }
    public static void main(String[] args) {
        int num1,num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers :- ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        sc.close();
        if (isPrime(num1)&&isPrime(num2)&&Math.abs(num1-num2)==2)
            System.out.print("Twin Prime Numbers.");
        else
            System.out.print("Not Twin Prime Numbers.");
       
    }   
}
