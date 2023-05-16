import java.io.*;
class Sales{
    public static void main(String[] args)throws IOException {
        // declaration
        double amt,finalBill = 0.0,totalSales = 0.0,discAmt = 0.0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 1;i<=25;i++){
            // inputs
            System.out.print("Enter amount for Bill "+i+" : ");
            amt = Double.parseDouble(br.readLine());    
            
            // calculating discount amount,total sales and final amount
            if (amt<=3000)
                discAmt = amt*4.0/100;
            else if (amt<=5000)
                discAmt = amt*7.5/100;
            else if (amt<=12000)
                discAmt = amt*12.5/100;
            else 
                discAmt = amt*18.5/100;
            finalBill = amt-discAmt;
            totalSales+=finalBill;

            // output
            System.out.println("Discount Amount = Rs."+discAmt);
            System.out.println("Final Amount for Bill "+i+" : Rs."+finalBill+"\n");
        }
        System.out.println("Total Sale : Rs."+totalSales);
    }
}