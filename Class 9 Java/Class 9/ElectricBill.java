import java.io.*;
class ElectricBill {
    public static void main(String[] args)throws IOException {
        // declaration
        String n; int units; double bill = 0.0;

        // inputs
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.print("Enter your name - ");
        n = br.readLine();
        System.out.print("Enter units consumed - ");
        units = Integer.parseInt(br.readLine());

        // decision-making
        if (units<=100)
            bill = 2*units;
        else 
            if (units<=300)
                bill = 2*100+3*(units-100);
            else
                bill = (2*100+3*200+5*(units-300))*2.5/100+2*100+3*200+5*(units-300);
        
        // output
        System.out.print("\nName - "+n+"\tUnits consumed - "+units+"\nBill Payable - Rs."+bill);
    }
}
