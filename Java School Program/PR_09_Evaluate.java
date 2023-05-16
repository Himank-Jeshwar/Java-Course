import java.io.*;
public class PR_09_Evaluate {
    public static void main(String[] args) throws IOException {
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(inp);
        System.out.print("Enter cost price = ");
        double cp = Double.parseDouble(br.readLine());
        double profit = (cp*28.5)/100.0;
        double sp = cp + profit;
        System.out.println("Selling Price = Rs."+sp);

    }    
}
