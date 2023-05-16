import java.io.*;
class PerfectSquare {
    public static void main(String[] args)throws IOException {
        int c = 0; // counter
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 1;i<=10;i++){
            int num,sq_root;
            System.out.print("Enter a number = ");
            num = Integer.parseInt(br.readLine());
            sq_root = (int)(Math.sqrt(num));
            if (sq_root*sq_root==num)
                c++;
        }
        System.out.print("Number of Perfect Squares = "+c);
    }
}
