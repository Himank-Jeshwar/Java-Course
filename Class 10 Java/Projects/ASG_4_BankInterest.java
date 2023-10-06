import java.util.*;
class ASG_4_BankInterest {
    double ist,p,t,amt;
    int a;
    
    void accept(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sum of money : ");
        p = sc.nextDouble();
        System.out.print("Enter age : ");
        a = sc.nextInt();
        System.out.print("Enter term : ");
        t = sc.nextDouble();
    }
    
    void calculate(){
        if (t<=1)
            ist = (a>=60)?p*8.0/100:p*7.5/100;    
        else 
            if(t<=2)
                ist = (a>=60)?p*9.0/100:p*8.5/100;
        else
            if (t<=3)
                ist = (a>=60)?p*10.0/100:p*9.5/100;
            else
                ist = (a>=60)?p*11.0/100:p*10.0/100;
            
            amt = p+ist;
    }

    void display(){
        System.out.println("Amount Deposited\tTerm\tAge\tInterest earned\tAmount Paid");
        System.out.println(p+"\t"+t+"\t"+a+"\t"+ist+"\t"+amt);
    }
    public static void main(String[] args) {
        ASG_4_BankInterest ob = new ASG_4_BankInterest();
        ob.accept();
        ob.calculate();
        ob.display();
    }    
}
