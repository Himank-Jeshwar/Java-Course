public class PR_08_Pattern2_Recursion {
    static void drawPattern(int n){
        if (n==0)
            return;
        else
            drawPattern(n-1);
            for (int i = 1;i<=n;i++){
                System.out.print("*");
            }
            System.out.println();
    }
 
    public static void main(String[] args) {
        drawPattern(4);
    }
}
