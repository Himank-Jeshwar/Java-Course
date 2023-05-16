public class NumberPattern5 {
    public static void main(String[] args) {
        int k = 15;
        for (int i = 1;i<=5;i++){
            for (int j = 5;j>=i;j--,k--){
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}
