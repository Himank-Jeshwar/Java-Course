import java.io.*;
class Digits{
    public static void main()throws IOException{
        // declaration
        int num;
        
        // inputs
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a 3-digit number : ");
        num = Integer.parseInt(br.readLine());
        
        // output
        System.out.print(num/100+"\n"+(num/10)%10+"\n"+num%10);
    }
}