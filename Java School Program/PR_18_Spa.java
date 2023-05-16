/*
in a spa , female customer gets 13.67 % off in total bill , while
a male customer gets  8.3 % off in total bill.
Take bill and gender (M/F or m/f) as input and display the 
final amount */

import java.io.*;
public class PR_18_Spa {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        // declaration
        double bill ; char gender ;
        System.out.print("Enter bill = ");
        bill = Double.parseDouble(br.readLine());
        System.out.println("Enter gender (M/F or m/f) = ");
        gender = br.readLine().charAt(0);
        double amount = bill-(13.67*bill)/100;
        // decision
        if (gender=='M' || gender == 'm')
            amount = bill-(8.3*bill)/100.0;
        // output
        System.out.print("Amount Payable = Rs."+amount);
        }
}