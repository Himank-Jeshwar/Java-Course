import java.io.*;
public class Series3 {
    static int factorial(int num){
        int f = 1;
        for (int i = 1;i<=num;i++){
            f*=i;
        }
        return f;
    }
    public static void main(String[] args)throws IOException {
        double sum = 0,a;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a : ");
        a = Integer.parseInt(br.readLine());
        for (int i = 2;i<=10;i++){
            if(i%2==0)
                sum+=a/factorial(i);
            else
                sum-=a/factorial(i);
        }
        System.out.println("S = "+sum);
    }
}
