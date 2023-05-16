import java.io.*;
class ShowRoom {
    public static void main(String[] args)throws IOException {
        // declaration
        String name;long mobno;double cost,dis = 0.0,amount = 0.0;
        
        // inputs
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter your name - ");
        name = br.readLine();
        System.out.print("Enter your mobile number - ");
        mobno = Long.parseLong(br.readLine());
        System.out.print("Enter cost price - ");
        cost = Double.parseDouble(br.readLine());

        // decision and calculation
        if (cost<=10000)
            dis = cost*5/100;
        else
            if (cost<=20000)
                dis = cost*10/100;
            else
                if (cost<=35000)
                    dis = cost*15/100;
                else
                    dis = cost*20/100;
        
        amount = cost-dis;

        // output
        System.out.println("\nName - "+name+"\tMobile number - "+mobno);
        System.out.print("Amount to be paid - "+amount);
    }    
}
