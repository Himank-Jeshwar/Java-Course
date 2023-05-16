// 64
// 6^2 + 4^2  = 36+16 = 52
// 912
// 9^3+1^3+2^3
import java.io.*;
public class Sum_Digits {
    int num;
    void input ()throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a number = ");
        num = Integer.parseInt(br.readLine());
    }

    void show(){
        int noOfDigits = 0,temp = num,result = 0;
        while (temp!=0){
            noOfDigits++;
            temp/=10;
        }
        while (num!=0){
            result+=Math.pow(num%10,noOfDigits);
            num/=10;
        }
        System.out.println("Result = "+result);
        System.out.print("Number of digits = "+noOfDigits);
    }
    public static void main(String[] args)throws IOException {
        Sum_Digits sd = new Sum_Digits();
        sd.input();
        sd.show();
    }
}
