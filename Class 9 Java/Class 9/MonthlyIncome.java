public class MonthlyIncome {
    public static void main(String[] args) {
        int daysAbsent = 5;
        double totalInc = 350*30,deductedInc = 30*daysAbsent;
        System.out.print("Monthly income = Rs."+(totalInc-deductedInc));
    }
}
