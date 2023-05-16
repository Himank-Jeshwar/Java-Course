import java.io.*;
public class PalindromeNumber {
    int newNum,oldNum;
    void input()throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a number = ");
        oldNum = Integer.parseInt(br.readLine());
    }

    void show(){
        int copyOfoldNum = oldNum;
        int d = 0;
        newNum = 0;

        while (copyOfoldNum!=0){
            d = copyOfoldNum%10;
            newNum=newNum*10+d;
            copyOfoldNum/=10;
        }
        if (oldNum==newNum)
            System.out.println("Palindrome number");
        else
            System.out.println("Not a Palindrome number");
        }
    public static void main(String[] args) throws IOException{
        PalindromeNumber pn = new PalindromeNumber();
        pn.input();
        pn.show();
        // System.out.println(2121%1000);
    }
}
