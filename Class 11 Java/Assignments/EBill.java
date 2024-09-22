import java.util.*;
class EBill{
    String name,month;
    long consNo;
    int units;
    double charge,cess;

    public EBill(){
        name = "";
        month = "";
        consNo = 0L;
        units = 0;
        charge = 0.0;
        cess = 0.0;
    }

    void input() {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter your name : ");
        name = sc.nextLine();
        System.out.print("Enter your consumer number : ");
        consNo = sc.nextLong();
        System.out.print("Enter your month : ");
        month = sc.next();
        System.out.print("Enter units consumed : ");
        units = sc.nextInt();
    }

    double calculate(){
        if (units<=100)
            charge = 2.3*units;
        else 
            if (units<=300)
                charge = 2.3*100+2.75*(units-100);
            else 
                if (units<=900)
                    charge = 2.3*100 + 2.75*200 + 3.50*(units-300);
                else    
                    charge = 2.3*100 + 2.75*200 + 3.50*600 + 5.0*(units-900);
                    
        cess = charge*0.0185; // calculate cess
        
        return (charge+cess);
    }

    void display(){
        // correcting upto 2 decimal places 
        double net = (int)(calculate()*100)/100.0;
        charge = (int)(charge*100)/100.0; 
        cess = (int)(cess*100)/100.0;

        System.out.println("NAME - "+name);
        System.out.println("CONSUMER NO. - "+consNo);
        System.out.println("NAME OF THE MONTH - "+month);
        System.out.println("UNITS CONSUMED - "+units);
        System.out.println("CHARGE\t\tCESS\t\tNET");
        System.out.println(charge+"/-\t\t"+cess+"/-\t\t"+net+"/-");
    }

    public static void main() {
        EBill ob = new EBill();
        ob.input();
        ob.display();              
    }
}