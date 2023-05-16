import java.io.*;
public class PR_19_Expression {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        double a,b,c,x;
        System.out.print("Enter a = ");
        a = Double.parseDouble(br.readLine());
        System.out.print("Enter b = ");
        b = Double.parseDouble(br.readLine());
        System.out.print("Enter c = ");
        c = Double.parseDouble(br.readLine());
        x = (2*a*Math.sqrt(Math.pow(b,6)-a*Math.pow(c,7)))/Math.pow(b-c,3);
        System.out.print("x = "+x);
    }
}
