public class PR_08_Sum {
    public static void main(String[] args) {
        int x = 8;
        int j = 1;
        int total = 0;
        while (j<=10){
            total+=x*j;
            j++;
        }
        System.out.println("Total = "+total);
    }
}
