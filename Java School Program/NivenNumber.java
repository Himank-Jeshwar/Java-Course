import java.io.*;
class NivenNumber {
    static int sumOfDigits(int n){
        int sum = 0;
        while (n>0){
            sum+=(n%10);
            n/=10;
        }
        return sum;
    }
    static void isNiven(int n){
        if (n%sumOfDigits(n)==0)
            System.out.println("Niven Number");
        else
            System.out.println("Not a niven Number");
    }
    public static void main(String[] args)throws IOException {
        // declaration
        int num;

        // input
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(inp);
        System.out.print("Enter a number : ");
        num = Integer.parseInt(br.readLine());

        // decision
        isNiven(num);

    }    
}
