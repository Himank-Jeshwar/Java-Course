public class NumberPattern1 {
    public static void main(String[] args) {
        int n = 1,r;
        for (int i = 1;i<=5;i++){ // row times 
            r = n;
            for (int j = 1;j<=i;j++,r+=2){ // column times
                System.out.print(r+" ");
            }
            n+=2;
            System.out.println();
        }
    }
}
