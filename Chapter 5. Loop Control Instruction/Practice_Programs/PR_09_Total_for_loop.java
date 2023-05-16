public class PR_09_Total_for_loop {
    public static void main(String[] args) {
        int n = 5;
        int sum = 0;
        for (int no = 0;no<n;no++){
            sum+=2*no;
        }
        System.out.print("Sum of first "+n+" even numbers = "+sum);
    }
}
