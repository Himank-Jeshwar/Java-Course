public class PR_03_Pattern {
    public static void main(String[] args) {
        // Upper portion
        int rows1 = 4;
        for (int t = 1;t<=rows1;t++){
            for (int u = 1;u<=t;u++){
                System.out.print("*");
            }
        System.out.println();
        }
        // Lower portion
        int rows2 = 4;
        for (int z = 1;z<=rows2;z++){
            for (int r = 3;r>=z;r--){
                System.out.print("*");
            }
        System.out.println();
        }
    }
}
