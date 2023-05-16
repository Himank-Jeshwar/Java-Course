import java.io.*;
public class Series1 {
    public static void main(String[] args) {
        double sum = 0;
        int a ,n;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.print("Enter a number = ");
            a = Integer.parseInt(br.readLine());
            System.out.print("Enter a value for n = ");
            n = Integer.parseInt(br.readLine());
            for (int i = 1;i<=n;i++){
                sum+=Math.pow(a,i);
            }
            System.out.print("Sum of the series = "+sum);
        }
        catch (IOException e){
            System.out.println(e);
        }

       
    }
}
