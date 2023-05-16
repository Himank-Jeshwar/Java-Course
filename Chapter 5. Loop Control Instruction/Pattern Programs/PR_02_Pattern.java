public class PR_02_Pattern {
    public static void main(String[] args) {
        int rows = 5;
        for (int r = 1;r<=rows;r++){
            for (int y = 5;y>=r;y--){
                System.out.print("*");
            }
        System.out.println();
        }
    }
}
