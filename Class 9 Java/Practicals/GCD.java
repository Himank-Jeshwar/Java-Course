/* 
GCD BY LONG-DIVISION METHOD
Taken two numbers , num1 and num2.
if (num1 < num2){
    divisor = num1;
    dividend = num2;
}
else  {
    divisor = num2;
    dividend = num1;
}

remainder = dividend%divisor;
while (remainder!=0){
    oldDivisor = divisor;
    divisor = remainder;
    dividend = oldDivisor;
    remainder = dividend%divisor;
}
gcd = divisor;
*/
import java.io.*;
class GCD {
    public static void main(String[] args) throws IOException{
        // declaration
        int num1,num2,remainder,divisor,oldDivisor,dividend,gcd;

        // inputs
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 2 numbers to find their gcd = ");
        num1 = Integer.parseInt(br.readLine());
        num2 = Integer.parseInt(br.readLine());
        
        // decision
        if (num1<num2){
            divisor = num1;
            dividend = num2;
        }
        else{
            divisor = num2;
            dividend = num1;
        }

        remainder = dividend%divisor; 
        // calculating the gcd
        while (remainder!=0){
            oldDivisor = divisor;
            divisor = remainder;
            dividend = oldDivisor;
            remainder = dividend%divisor;
        }
        
        gcd = divisor;
        System.out.print(gcd);
    }
}
