public class PR_02_Total {
    public static void main(String[] args) {
        int n = 5;
        int sum = 0;
        int no = 0;
        while (no<n){
            sum+=2*no;
            no++;
        }
        System.out.print("Sum of first "+n+" even numbers = "+sum);
    } 
}
