import java.util.*;
class TaxPayable {
    void Tax(String name,int income){
        double t = 0.0;
        if (income<=250000)
            t = 0.0;
        else 
            if (income<=500000)
                t = 0.1*(income-250000);
            else 
                if (income<=1000000)
                    t = 30000+0.2*(income-500000);
                else 
                    t = 50000+0.3*(income-1000000);

        System.out.println("Name of the employee : "+name);
        System.out.println("Income tax = Rs."+t);
        
    }
    public static void main(String[] args) {
        String n;
        int inc;
        TaxPayable tp = new TaxPayable();
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter name : ");
        n = sc.nextLine();
        System.out.print("Enter annual income : ");
        inc = Math.abs(sc.nextInt());

        tp.Tax(n, inc);
    }
}
