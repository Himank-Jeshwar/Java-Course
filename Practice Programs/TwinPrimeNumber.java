import java.util.Scanner;
public class TwinPrimeNumber {
    static boolean isPrime(int num){
        boolean primeOrNot = (num==2)?true:false;
        for (int x = 2;x<num;x++){
            primeOrNot = (num%x!=0)?true:false;
            if (primeOrNot==false)
                break;
        }
        return primeOrNot;
    }
    public static void main(String[] args) {
        int start,end;
        Scanner sc = new Scanner(System.in);
        System.out.println("Give a range of numbers :");
        System.out.print("Enter start value : ");
        start = sc.nextInt();
        System.out.print("Enter end value : ");
        end = sc.nextInt();

        System.out.print("\nTwin Primes between "+start+" to "+end+":-\n");
        for (int i = start;i<=end;i++){
            if (isPrime(i)==true&&isPrime(i+2)==true)
                System.out.println("("+i+","+(i+2)+")");
        }          
    }
}