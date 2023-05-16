import java.io.*;
public class AbsoluteValue {
    public static void main(String[] args)throws IOException {
        // declaration
        int num;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter any number = ");
        num = Integer.parseInt(br.readLine());

        // decision
        if (num<0)
            num*=-1;
        
        // output
        System.out.print(num);
    }
}
