public class PR_10_Pattern5 {
    public static void main(String[] args) {
        // Execute this for method 2 and 3
        // for(int i = 1;i<=4;i++){
        //     for (int j = 1;j<=i;j--){
        //         System.out.print(" ");
        //     }
        // Method 1
        for(int i = 4;i>=1;i--){
                for (int j = 5;j>=i;j--){
                    System.out.print(" ");
            }
            for (int k = 1;k<(i*2);k++){
                System.out.print("*");
            }

            // Method 2
            // for (int k = 9;k>(i*2);k--){
            //     System.out.print("*");
            // }

            // Method 3
            // for (int l = 3;l>=i;l--){
            //     System.out.print("*");
            // }
            System.out.println();
        }
    }
}
