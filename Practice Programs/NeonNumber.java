// Neon Number
/* Ex 1: square(9) = 81 =>  8+1 = 9
    Hence, 9 is a neon number.*/

/* Ex 2: square(4) = 16 => 1+6 = 7
    Hence, 4 is not a neon number. */
import java.util.Scanner;
public class NeonNumber {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter number to check whether it is neon number or not - ");
        n = sc.nextInt();
        
        int i = 10,sum = n*n%10;
        while((n*n/i)!=0){
            sum += (n*n/i);
            i*=10; 
        }
        if (sum==n)
            System.out.print(n+" is a neon number.");
        else
            System.out.print(n+" is not a neon number.");
    }
}
