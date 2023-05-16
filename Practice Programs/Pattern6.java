public class Pattern6 {
    public static void main(String[] args) {
        for (int i = 1;i<=5;i++){
            
            // Method 1
            // for (int j = 1;j<i;j++){
            //     System.out.print(" ");
            // }
            // System.out.print("*");
            // System.out.println();

            // Method 2 
            for (int j = 1;j<=i;j++){
                if (j<i){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
