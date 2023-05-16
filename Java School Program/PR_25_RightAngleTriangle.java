import java.io.*;
public class PR_25_RightAngleTriangle {
    public static void main(String[]args)throws IOException{
        // declaration
        double base,ht,hyp;

        // inputs
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter base : ");
        base = Double.parseDouble(br.readLine());
        System.out.print("Enter height : ");
        ht = Double.parseDouble(br.readLine());
        System.out.print("Enter hypotenuse : ");
        hyp = Double.parseDouble(br.readLine());

        // decision
        if (base+ht>hyp||hyp+ht>base||base+hyp>ht)
            if (hyp*hyp==base*base+ht*ht)
                System.out.print("It can form a right-angle triangle.");
            else
                System.out.print("It cannot form a right-angle triangle.");
        else
            System.out.print("It cannot form any triangle.");
    }
    
}