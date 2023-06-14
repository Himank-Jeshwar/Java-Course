import java.util.*;
class PR_03_Salary {
    private int basic; // declaration
     
    void input(){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter basic pay : ");
        basic = sc.nextInt();
    }

    void display(){
        // calculation
        double da = 0.3*basic;
        double hra = 0.1*basic;
        double gross = basic+da+hra;
        
        // output
        System.out.print("DA : Rs."+da+"\nHRA : Rs."+hra+"\nGross : Rs."+gross);
    }

    public static void main(String[] args) {
        // instantiation
        PR_03_Salary sal = new PR_03_Salary();
        sal.input();
        sal.display(); 
    }
}
