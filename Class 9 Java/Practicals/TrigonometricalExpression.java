import java.io.*;
public class TrigonometricalExpression {
    public static void main(String[] args)throws IOException {
        // declaration
        double a,b,trigExp;

        // inputs
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter values for angle A and angle B (in degrees):- ");
        a = Integer.parseInt(br.readLine());
        b = Integer.parseInt(br.readLine());

        // calculation
        trigExp = Math.toRadians((Math.tan(a)-Math.tan(b))/(1+Math.tan(a)*Math.tan(b)));

        // output
        System.out.print("Answer - "+trigExp);
        
    }
}
