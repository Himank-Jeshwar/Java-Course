public class NumberPattern4 {
    public static void main(String[] args) {
        // Floyd's Triangle
        int k = 1;
        for (int i = 1;i<=5;i++){
            for (int j = 1;j<=i;j++,k++){
                System.out.print(k+" ");
            }
            System.out.println();
        }             
    }    
}
