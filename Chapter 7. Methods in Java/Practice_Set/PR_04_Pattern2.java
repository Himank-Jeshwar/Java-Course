public class PR_04_Pattern2 {
    static void drawPattern(){
        for (int i = 1;i<=4;i++){
            for (int k = 4;k>=i;k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        drawPattern();
    }
}
