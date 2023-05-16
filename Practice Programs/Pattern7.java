public class Pattern7 {
    public static void main(String[] args) {
        for (int k = 1;k<=5;k++){
            /*
            Method 1 
            for (int o = 5;o>k;o--){
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
            */

            // Method 2
            for (int o = 5;o>=k;o--){
                if (o>k)
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}
