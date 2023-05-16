import java.io.*;
class SumofDigits{
    public static void main ()throws IOException{
        // declaration
        int num,sum = 0,max,min;
        
        // inputs
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        System.out.print("Enter a 4 digit number = ");
        num = Integer.parseInt(br.readLine());
        
        // decision
        if (num>999 && num<=9999){
            sum = num/100+num%100;
            System.out.println("Sum of first 2 and last 2 places = "+sum);
            if (num/100>num%100){
                max = num/100;
                min = num%100;
            }
            else{
                max = num%100;
                min = num/100;
            }
            System.out.println("Square root of larger number = "+Math.sqrt(max));
            System.out.println("Half of smaller number = "+(min/2.0));
            System.out.print("Cube root of smaller number = "+Math.cbrt(min));
        }
    }
}