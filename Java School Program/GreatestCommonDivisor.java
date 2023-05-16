import java.io.*;
class GreatestCommonDivisor{
    public static void main(String[] args)throws IOException {
        // declaration
        int num1,num2,remainder,divisor;
        
        // inputs
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 2 numbers : ");
        num1 = Integer.parseInt(br.readLine());
        num2 = Integer.parseInt(br.readLine());

        // calculating gcd
        remainder = (int)(Math.max(num1,num2)%Math.min(num1,num2));
        divisor = (int)(Math.max(num1,num2));
        for(;remainder!=0;){
            divisor = remainder;
            remainder = divisor%remainder;
            
        }

        //output
        System.out.print("GCD = "+divisor);
    }
}