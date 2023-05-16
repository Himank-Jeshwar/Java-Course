import java.io.*;
public class QuadraticEquation {
    public static void main(String[] args)throws IOException {
        // declaration
        double root1,root2,a,b,c,d;

        // inputs
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter value for a = ");
        a = Double.parseDouble(br.readLine());
        System.out.print("Enter value for b = ");
        b = Double.parseDouble(br.readLine());
        System.out.print("Enter value for c = ");
        c = Double.parseDouble(br.readLine());

        // calculation
        d = b*b-4*a*c;
        root1 = (-b+Math.sqrt(d))/(2*a);
        root2 = (-b-Math.sqrt(d))/(2*a);

        // decision
        if (d>0)
            System.out.println("Roots are real and different.");
        else
            if(d==0)
                System.out.println("Roots are real and equal.");
            else
                System.out.println("Roots are complex and different.");
        
        // output
        System.out.print("First root = "+root1+"\nSecond root = "+root2);        
    }    
}
