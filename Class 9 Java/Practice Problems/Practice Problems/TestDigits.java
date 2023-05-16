import java.io.*;
class TestDigits{
    int a,b;
    void input()throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the two digits of a number below :-");
        a = Integer.parseInt(br.readLine());
        b = Integer.parseInt(br.readLine());
    }
    
    void showResult(){
        // declaration 
        int num = 0,revNum = 0;
        double result = 0.0;
        
        // calculation
        num = 10*a+b;
        revNum = 10*b+a;
        result = (num+revNum)/(a-b);
        
        // output
        System.out.print("Result = "+result);
    }
    public static void main()throws IOException{
        TestDigits td = new TestDigits();
        td.input();
        td.showResult();
    }
}