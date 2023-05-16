public class NumberPattern2 {
    public static void main(String[] args) {
        for (int i = 1;i<=5;i++){
            for (int j = 1,n = 1;j<=i;j++,n++){
                System.out.print(n+" ");
            }
            System.out.println();
        }
    }
}
