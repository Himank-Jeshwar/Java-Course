import java.io.*;
class ElectricityBill {
    public static void main(String[] args)throws IOException {
        // declaration
        String name,month;
        int units,consumerNum; double totalBill = 0.0;

        // inputs
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the costumer's name = ");
        name = br.readLine();
        System.out.print("Enter the consumer number = ");
        consumerNum = Integer.parseInt(br.readLine());
        System.out.print("Enter the month = ");
        month = br.readLine();
        System.out.print("Enter the units consumed = ");
        units = Integer.parseInt(br.readLine());
        // decision
        if(units<=100)
            totalBill = 1.8*units;
        else
            if(units<=300)
                totalBill = 1.8*100 + 2.30*(units-100);
            else
                if(units<=500)
                    totalBill = 1.8*100 + 2.30*200 + 2.80*(units-300);
                else
                    totalBill = 1.8*100 + 2.30*200 + 2.80*200 + 3.50*(units-500);
        
        // output
        System.out.println("\nName - "+name+"\nConsumer Number - "+consumerNum+"\nMonth - "+month);
        System.out.print("Units Consumed - "+units+"\nTotal Bill = Rs."+totalBill);                  
    }    
}
