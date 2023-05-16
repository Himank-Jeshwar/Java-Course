public class TestForLongType {
    public static void main(String[] args) {
        long max = (long)(Math.pow(2,63)-1L);
        long maxYrs = max/(1000*3600L*24*365);
        long currentYrsCompleted = System.currentTimeMillis()/(1000*3600*24L*365);
        long timeLeft = maxYrs-currentYrsCompleted;
        // System.out.println("Long Max Limit = "+max);
        // System.out.println("Milliseconds = "+System.currentTimeMillis());
        System.out.println("Time left = "+timeLeft+" years");
    }
}
