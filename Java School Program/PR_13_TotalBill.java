// profit = (27*cp)/100
// vat = (12.7*cp)/100
// sc =  (3.87*cp)/100
// sp = cp+profit+vat+sc
public class PR_13_TotalBill {
    public static void main(String[] args) {
        double cp = 32500.0;
        double profit = (27*cp)/100; 
        double vat = (12.7*cp)/100; 
        double sc = (3.87*cp)/100;
        double sp = cp+profit+vat+sc;
        System.out.print("Selling Price = Rs."+sp+"\nProfit = Rs."+profit+"\nVAT = Rs."+vat+"\nService Charge = Rs."+sc);
    }
} 