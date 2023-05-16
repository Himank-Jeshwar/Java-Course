public class NumberPattern4 {
    public static void main(String[] args) {
        int n = 1;
        for (int i = 1;i<=5;i++){
            for (int j = 9;j>=n;j-=2){
                System.out.print(j+" ");
            }
            n+=2;
            System.out.println();
        }
    }    
}
