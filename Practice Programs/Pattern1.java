public class Pattern1 {
    public static void main(String[] args) {
        for (int i = 1;i<=4;i++){
            for (int j = 3;j>=i;j--){
               System.out.print(" ");
            }
            for (int k = 1;k<=i;k++){
               System.out.print("*");
            }
            System.out.println();
        }

        for (int p = 1;p<=3;p++){
            for (int q = 1;q<=p;q++){
                System.out.print(" ");
            }
            for (int r = 3;r>=p;r--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
