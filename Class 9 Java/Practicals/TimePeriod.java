import java.io.*;
class TimePeriod {
    public static void main(String[] args)throws IOException {
        // declaration
        double t,l,g;

        // inputs
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the length (in m) = ");
        l = Double.parseDouble(br.readLine());
        System.out.print("Enter the acceleration due to gravity = ");
        g = Double.parseDouble(br.readLine());

        // calculation
        t = 2*22*Math.sqrt(l/g)/7;

        // output
        System.out.print("Time period of the pendulum = "+t+" s");
    }
}
