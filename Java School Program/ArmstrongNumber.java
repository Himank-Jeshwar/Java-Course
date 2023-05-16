// 153 = 1^3 + 5^3 + 3^3
import java.io.*;
class ArmstrongNumber {
    public static void main(String []args)throws IOException{
        int number,digits = 0,sum = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a number = ");
        number = Integer.parseInt(br.readLine());

        int n1,n2;
        n1=n2=number;
        while (n1>0) {
            digits++;
            n1/=10;
        }
        while (n2>0){
            sum+=Math.pow(n2%10,digits);
            n2/=10;
        }
        System.out.print((sum==number)?number+" is an Armstrong number":number+" is not an Armstrong number");
    }
}