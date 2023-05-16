public class NumberPattern3 {
    public static void main(String[] args) {
        int o = 5;
        for (int i = 1;i<=5;i++){
            for (int n = o;n>=1;n--){
                System.out.print(n+" ");
            }
            o--;
            System.out.println();
        }

    }
}
