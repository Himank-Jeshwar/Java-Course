public class NumberPattern6 {
    public static void main(String[] args) {
        int k = 1;
        for (int i = 1;i<=5;i++){
            for (int j = 5;j>=i;j--,k++){
                System.out.print(k+"  ");
            }
            System.out.println();
        }
    }
}
