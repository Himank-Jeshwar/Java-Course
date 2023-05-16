import java.io.*;
class SumOfDigits2{
    public static void main()throws IOException{
        // declaration
        int num,s = 0;
        
        // inputs
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a number = ");
        num = Integer.parseInt(br.readLine());
        
        // calculation
        while(num>0){
            s+=num%10;
            num/=10;
        }
        
        // output
        System.out.print("Sum of digits = "+s);
    }
}