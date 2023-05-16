import java.io.*;
public class PronicNumber {
    int num;
    void input () throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a number = ");
        num = Integer.parseInt(br.readLine());
    }
    void show(){
        boolean isPronic = false;
        for (int i = 1;i<=num;i++){
            if (i==num)
                break;
                if (i*(i+1)==num){
                    isPronic = true;
                    break;
                }
                else
                    isPronic = false;
        }
        if (isPronic==true)
            System.out.print(num+" is a pronic number.");
        else
            System.out.println(num+" is not a pronic number.");
    }
    public static void main(String[] args)throws IOException {
        PronicNumber proNum = new PronicNumber();
        proNum.input();
        proNum.show();
    }
}
