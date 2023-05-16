public class PR_07_Pattern1_Recursion {
    static void drawPattern(int n){
        if (n==0)
            return;
        else
            drawPattern(n-1);
            for (int i = 4;i>=n;i--){
                System.out.print("*");
            }
            System.out.println();
    }

    public static void main(String[] args) {
        drawPattern(4);
    }
}
