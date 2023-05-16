import java.io.*;
class SumOfOddAndEvenNumbers {
    int m,n;
    void input()throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter m : ");
        m = Integer.parseInt(br.readLine());
        System.out.print("Enter n : ");
        n = Integer.parseInt(br.readLine());
    }
    
    void display(){
        int sumOfEvenNum = 0, sumOfOddNum = 0;
        for (;m<=n;m++){
            if (m%2==0)
                sumOfEvenNum+=m;
            else
                sumOfOddNum+=m;
        }
        System.out.println("Sum of Odd Numbers = "+sumOfOddNum);
        System.out.println("Sum of Even numbers = "+sumOfEvenNum);
    }
    public static void main(String[] args)throws IOException {
        SumOfOddAndEvenNumbers obj = new SumOfOddAndEvenNumbers();
        obj.input();
        obj.display();
    }
}
