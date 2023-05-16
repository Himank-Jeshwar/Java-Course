public class PR_14_Cycle {
    public static void main(String[] args) {
    
    // declaration
    double cp=1200.0,repairs=250.0,color=350.0,accessories=500.0;
    double profit = 1500.0; 
    // calculation 
    double totalPrice = cp+repairs+color+accessories;
    double sp = totalPrice+profit;
    double profitPercent = (profit*100.0)/totalPrice;
    // output
    System.out.print("Selling price = Rs."+sp+"\nProfit percent = "+profitPercent+" %");
    }
}
