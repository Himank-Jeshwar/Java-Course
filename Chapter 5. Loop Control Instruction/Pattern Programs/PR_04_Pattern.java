public class PR_04_Pattern {
    public static void main(String[] args) {
        for (int u = 1;u<=5;u++){
            for (int sp1 = 4;sp1>=u;sp1--){
                System.out.print(" ");
            }
            for (int i = 1;i<=u;i++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int l = 1;l<=5;l++){
            for (int sp2 = 1;sp2<=l;sp2++){
                System.out.print(" ");
            }
            for (int o = 4;o>=l;o--){
                System.out.print("*");
            }
            System.out.println();
        } 
    }
}