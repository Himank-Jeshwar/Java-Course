import java.io.*;
class ElectricityBill{
    public static void main () throws IOException{
        // declaration
        String name,cn,month; int units;
        double bill = 0.0;
        
        // inputs
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter your name = ");
        name = br.readLine();
        System.out.print("Enter your customer number = ");
        cn = br.readLine();
        System.out.print("Enter month = ");
        month = br.readLine();
        System.out.print("Enter units = ");
        units = Integer.parseInt(br.readLine());
        
        // decision
        if (units<=100)
             bill = (units*1.8);
        else if (units<=300)
            bill = (units-100)*2.3+100*1.8;
        else if (units<=500)
            bill = (units-300)*2.8+100*1.8+200*2.3;
        else if (units>500)
            bill = (units-500)*3.5+100*1.8+200*2.3+200*2.8;
        
        // output
        System.out.print("Name :"+name+"\nConsumer Number :"+cn+"\tMonth : "+month+"\n");
        System.out.print("Bill to be paid = "+bill);
    }
}