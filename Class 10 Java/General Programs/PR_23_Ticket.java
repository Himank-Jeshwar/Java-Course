import java.util.*;
class PR_23_Ticket {
    // declaration
    String n;
    double amt,dis,net;

    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name : ");
        n = sc.nextLine();
        System.out.print("Enter ticket amount : ");
        amt = sc.nextDouble();
    }

    void calculate(){
        if (amt<=25000)
            dis = 0.02*amt;
        else 
            if (amt<=35000)
                dis = 0.1*amt;
            else 
                if (amt<=55000)
                    dis = 0.12*amt;
                else 
                    if (amt<=70000)
                        dis = 0.16*amt;
                    else
                        dis = 0.18*amt;

        net = amt-dis;
    }

    void display(int sl){
        System.out.println("S.No\tName\tTicket Charge\tDiscount\tNet Amount");
        System.out.println(sl+"\t"+n+"\t"+amt+"\t"+dis+"\t"+net);
    }

    public static void main(String[] args) {
        PR_23_Ticket ob = new PR_23_Ticket();
        
        for (int i = 1;i<=15;i++){
            System.out.println("ENTER DETAILS FOR CUSTOMER - "+i+"\n");
            ob.input();
            ob.calculate();
            ob.display(i);
        }   
    }    
}
