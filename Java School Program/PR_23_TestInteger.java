import java.io.*;
public class PR_23_TestInteger {

    public static void main(String[] args) throws IOException{
        // declaration
        int n,digits=1;
        
        // inputs
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter number = ");
        n = Integer.parseInt(br.readLine());

        // decision
        if (n>0&&n<10000){
            if (n<10)
                digits = 1;
            else if (n<100)
                digits = 2;
            else if (n<1000)
                digits = 3;
            else 
                digits = 4;        
            System.out.println("Number of digits in \'"+n+"\' = "+digits);
        }
        }
    
}