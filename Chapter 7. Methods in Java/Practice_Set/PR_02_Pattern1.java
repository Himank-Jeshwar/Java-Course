public class PR_02_Pattern1 {
    static void drawPattern(){
        for (int i = 1;i<=4;i++){
            for (int j = 1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        drawPattern();
    }
}
