import java.io.*;
class SumOfSeries2{
    public static void main() throws IOException{
        // declaration
        int s = 1,a,n=1;
        
        // inputs
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the value for 'a' = ");
        a = Integer.parseInt(br.readLine());
        
        // calculation
        while(n<=10){
            if (n%2!=0)
                s-=Math.pow(a,n);
            else
                s+=Math.pow(a,n);
            n++;
        }
        
        // output
        System.out.print("The sum is = "+s);
    }
}