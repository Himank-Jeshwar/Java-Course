import java.io.*;
class SumOfSeries{
    public static void main()throws IOException{
        // declaration
        int n;
        double s = 0;
        
        // inputs
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the value for 'n' = ");
        n = Integer.parseInt(br.readLine());
        
        // sum of series
        for (int i = 1;i<=n;i++){
            s+=1/Math.pow(2,i);
        }
        
        // output
        System.out.print("Sum of the series = "+s);
    }
}