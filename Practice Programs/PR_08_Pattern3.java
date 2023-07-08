public class PR_08_Pattern3 {
    public static void main(String[] args) {
        for (int i = 1;i<=4;i++){
            for (int j = 3;j>=i;j--){
                System.out.print(" ");
            }
            for (int k = 1;k<(i*2);k++){
                System.out.print("*");
            }
            // Alternative way
            // for (int l = 2;l<=i;l++){
                // System.out.print("*");
            // }
            System.out.println();
        }
    }
}
