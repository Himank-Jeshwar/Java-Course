import java.io.*;
class Employee {
    public static void main(String[] args)throws IOException {
        // declaration
        double basicPay,da,hra,pf,grossPay = 0.0,netPay = 0.0;

        // inputs
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the basic pay (in Rs.) = ");
        basicPay = Double.parseDouble(br.readLine());

        // calculation
        da = basicPay*30/100;
        hra = basicPay*15/100;
        pf = basicPay*12.5/100;
        grossPay = basicPay + da + hra;
        netPay = grossPay - pf;

        // output
        System.out.print("Gross Pay = Rs."+grossPay+"\nNet Pay = Rs."+netPay);
    }    
}
