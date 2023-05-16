import java.io.*;

public class Series2 {
    public static void main(String[] args)throws IOException {
        int a,n;
        double s = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a number = ");
        a = Integer.parseInt(br.readLine());
        System.out.print("Enter a value for n = ");
        n = Integer.parseInt(br.readLine());

        for (int i = 1,j = 1;i<=n;i++,j+=2){
            if (i%2==0)
                s-=Math.pow(a,j);
            else
                s+=Math.pow(a,j);
        }
        System.out.println("S = "+s);
    }
}
