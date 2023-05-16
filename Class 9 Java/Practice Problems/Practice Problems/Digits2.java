import java.io.*;
class Digits2{
    // declaration
    int num;
    
    void input ()throws IOException{
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        System.out.print("Enter a number = ");
        num = Integer.parseInt(br.readLine());
    }
    
    void display(){
        // decision
        if (num>=10&&num<=99)
            System.out.print("RESULT = "+Math.cbrt(num));
        else 
            System.out.print("RESULT = "+num*1.0/(num%100));
        
    }
    
    public static void main()throws IOException{
        Digits2 d2 = new Digits2();
        d2.input();
        d2.display();
    }
}