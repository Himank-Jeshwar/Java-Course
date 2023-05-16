 
import java.io.*;
class Product {
    public static void main(String[] args) throws IOException {
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(inp);
        // Taking Inputs
        System.out.print("Enter value for a = ");
        double a = Double.parseDouble(br.readLine());
        System.out.print("Enter value for b = ");
        double b = Double.parseDouble(br.readLine());
        // Calculation
        double ans = (Math.pow(a,2)*Math.pow(Math.sqrt(b),5))/4;
        // Output
        System.out.println("Answer = "+ans);
    }
}