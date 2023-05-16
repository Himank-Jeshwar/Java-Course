import java.io.*;
class QuadraticEquation{
    public static void main()throws IOException{
        // declaration
        double a,b,c,d = 0.0,root1 = 0.0,root2 = 0.0;
        
        // inputs
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter value for a : ");
        a = Double.parseDouble(br.readLine());
        System.out.print("Enter value for b : ");
        b = Double.parseDouble(br.readLine());
        System.out.print("Enter value for c : ");
        c = Double.parseDouble(br.readLine());
        
        // calculation
        d = b*b-4*a*c/(2*a);
        root1 = -b+Math.sqrt(d)/(2*a);
        root2 = -b-Math.sqrt(d)/(2*a);
        //decision
        if (d>0)
            System.out.println("Roots are real and different");
        else
            if (d==0)
                System.out.println("Roots are real and equal.");
            else
                System.out.println("Roots are complex and different.");
        
        System.out.print("Root 1 = "+root1+"\nRoot 2 = "+root2);
    }
}