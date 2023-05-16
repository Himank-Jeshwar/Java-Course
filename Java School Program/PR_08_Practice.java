import java.io.*;
public class PR_08_Practice {
    public static void main(String[] args) throws IOException {
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(inp);
        System.out.println("Enter value for a and b :- ");
        System.out.print("a = ");
        double a = Double.parseDouble(br.readLine());
        System.out.print("b = ");
        double b = Double.parseDouble(br.readLine());
        double ans = (Math.pow(a,12)*Math.sqrt(Math.pow(b,5)))/4.0;
        System.out.println(ans);
    }
    
}