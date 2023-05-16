import java.io.*;
class Amount{
    // declaration
    double bill,discAmt,finalBill;
    
    void input()throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the bill amount (in Rs) = ");
        bill = Double.parseDouble(br.readLine());
    }
    void display()throws IOException{
        for (int i = 0;i<25;i++){
            input();

            // calculation
            discAmt = (bill<=3000)?bill*0.045:(bill<=5000)?
            bill*0.075:(bill<=12000)?bill*0.125:bill*0.185;
            finalBill = bill-discAmt;

            //output
            System.out.println("Discount amount : Rs."+discAmt);
            System.out.println("Bill Payable = Rs."+finalBill+"\n");
        }
    }
    public static void main(String[] args)throws IOException {
        Amount amt = new Amount();
        amt.display(); 
    }
}
/* DATA LIST
 * bill - bill amount
 * discAmt - discount amount
 * finalBill - bill payable after discount
 * i - loop counter
 * amt - Manipulates data
 */