import java.io.*;
class IncomeTax{
    public static void main()throws IOException{
        // declaration
        int age;
        double inc,tax = 0.0;
        
        // inputs
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        System.out.print("Enter your age = ");
        age = Integer.parseInt(br.readLine());
        System.out.print("Enter your income (in Rs.) = ");
        inc = Double.parseDouble(br.readLine());
        
        // decision
        if (age<=65){
            if (inc<=160000)
                tax = 0.0;
            else 
                if (inc<=300000)
                    tax = 10*(inc-160000)/100.0;
                else
                    if (inc<=1000000)
                        tax = (20*(inc-300000)/100.0)+34000;
                    else
                        tax = (30*(inc-1000000)/100.0)+94000;
            System.out.print("Income tax payable = Rs."+tax);
        }
        else
            System.out.print("wrong category");
    }
}