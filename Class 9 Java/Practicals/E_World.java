import java.io.*;
class E_World{
    public static void main(String []args)throws IOException{
        // declaration
        double dis,finalBill = 0.0,purchaseAmt;
        String item,name; int choice;

        // inputs
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter your name = ");
        name = br.readLine();
        System.out.println("\nPress 1 to buy A.C\nPress 2 to buy laptop = \n");
        choice = Integer.parseInt(br.readLine());

        // decision
        if (choice==1){
            item = "A.C";
            System.out.print("Enter the purchase amount for A.C (in Rs.) = ");
            purchaseAmt = Double.parseDouble(br.readLine());
            if(purchaseAmt<=20000)
                dis = purchaseAmt*5/100;
            else
                if (purchaseAmt<=60000)
                    dis = purchaseAmt*9.25/100;
                else
                    dis = purchaseAmt*12.25/100;
            finalBill = (purchaseAmt-dis)*12.5/100 + (purchaseAmt-dis);
            System.out.println("Discount Amount = Rs."+dis);
            System.out.print("Net amount Payable = Rs."+finalBill+"\nName of the customer = "+name+"\tItem purchased = "+item);
        }
        else
            if(choice==2){
                item = "Laptop";
                System.out.print("Enter the purchase amount for laptop (in Rs.) = ");
                purchaseAmt = Double.parseDouble(br.readLine());
                if(purchaseAmt<=20000)
                    dis = purchaseAmt*5/100;
                else
                    if (purchaseAmt<=60000)
                        dis = purchaseAmt*12/100;
                    else
                        dis = purchaseAmt*16.75/100;
                finalBill = (purchaseAmt-dis)*12.5/100 + (purchaseAmt-dis);
                System.out.println("Discount Amount = Rs."+dis);
                System.out.print("Net amount Payable = Rs."+finalBill+"\nName of the customer = "+name+"\tItem purchased = "+item);
            }
        else
            System.out.println("Invalid Choice !");
    }
}