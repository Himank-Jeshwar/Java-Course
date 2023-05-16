import java.io.*;
class SumOfSeries3{
    public static void main() throws IOException{
        // declaration
        double a,s = 0;
        
        // inputs
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the value for 'a' = ");
        a = Integer.parseInt(br.readLine());
        
        // calculating sum of the series
        for (int i = 1;i<=5;i++){
            if (i%2==0)
                s-=a/i;
            else
                s+=a/i;
        }
        
        // output
        System.out.print("The sum is = "+s);
    }
}