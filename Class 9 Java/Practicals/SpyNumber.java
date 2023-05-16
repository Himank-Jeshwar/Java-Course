import java.io.*;
public class SpyNumber {
    int num;
    void input()throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a number = ");
        num = Integer.parseInt(br.readLine());
    }
    void show(){
        int sum = 0,product = 1;
        for (;num!=0;sum+=num%10,product*=num%10,num/=10);
        if (sum==product)
            System.out.print("It is a spy number");
        else
            System.out.print("It is not a spy number");
    }
    public static void main(String[] args)throws IOException {
        SpyNumber sn = new SpyNumber();
        sn.input();
        sn.show();
    }
}
