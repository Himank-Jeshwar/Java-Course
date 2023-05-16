import java.util.*;
class PR_56_Profit_Loss{
    int cp,sp;
    PR_56_Profit_Loss(){
        cp = 0;
        sp = 0;
    }
    void input(int m,int n){
        this.cp = m;
        this.sp = n;
    }

    void display(){
        double lp = 0.0,pp = 0.0;
        if (cp>sp){
            lp = (cp-sp)*100.0/cp;
            System.out.println("Loss Percent : "+lp+"%");
        }
        else {
            pp = (sp-cp)*100.0/cp;
            System.out.println("Profit Percent : "+pp+"%");
        }
    }

    public static void main(String[] args) {
        int sellPrice,costPrice; // declaration

        // instantiation
        PR_56_Profit_Loss obj = new PR_56_Profit_Loss();
        Scanner sc = new Scanner(System.in);

        // input
        System.out.print("Enter cost price : ");       
        costPrice = sc.nextInt();
        System.out.print("Enter selling price :");
        sellPrice = sc.nextInt();
        
        obj.input(costPrice, sellPrice);
        obj.display();
    }
}