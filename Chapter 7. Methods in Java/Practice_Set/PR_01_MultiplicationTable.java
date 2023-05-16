public class PR_01_MultiplicationTable {
    static void mulTable(int n){
        for (int i = 1;i<=10;i++){
            System.out.format("%d x %d = %d\n",n,i,n*i);
        }
    }
    public static void main(String[] args) {
        mulTable(8);
    }
}
