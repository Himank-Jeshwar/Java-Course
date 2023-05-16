import java.io.*;
class Digit {
    public static void main(String[] args)throws IOException {
        // declaration 
        int num;

        // inputs
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter any 1 or 2 or 3 digit number = ");
        num = Integer.parseInt(br.readLine());
        
        // decision
        if (num<10)
            System.out.print("Square of "+num+" = "+num*num);
        else
            if (num<100)
                System.out.print("Square root of "+num+" = "+Math.sqrt(num));
            else 
                if (num<1000)
                    System.out.print("Cube root of "+num+" = "+Math.cbrt(num));
                else
                    System.out.print("The number entered is more than three digits");
    }    
}
