import java.io.*;
class CompoundInterest {
    public static void main(String[] args)throws IOException {
        // declaration
        double principal,c1,c2,amt,rate = 5;

        // inputs
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the sum of money (in Rs.) = ");
        principal = Double.parseDouble(br.readLine());

        // calculation
        c1 = principal*rate*1/100;
        c2 = (principal+c1)*rate*1/100;
        amt = principal*Math.pow(1+rate/100,3);

        // output
        System.out.println("Compound interest for 1st year = Rs."+c1);
        System.out.println("Compound interest for 2nd year = Rs."+c2);
        System.out.print("Amount after 3 years = Rs."+amt);
    }    
}
