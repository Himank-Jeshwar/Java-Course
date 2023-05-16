import java.io.*;

public class CheckForPrimeInArray {
    void input(int[]num)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0;i<num.length;i++){
            num[i]=Integer.parseInt(br.readLine());
        }
    }

    boolean checkPrime(int num){
        boolean isPrime = (num%2==0)?true:false;
        for (int i = 2;i<=num-1;i++){
            if (num%i!=0){
                isPrime = true;
            }
            else{
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
    public static void main(String[] args)throws IOException {
        CheckForPrimeInArray cp = new CheckForPrimeInArray();
        int [] numbers = new int[20];
        cp.input(numbers);

        System.out.print("\nPrime numbers are - ");
        for (int j = 0;j<numbers.length;j++){
            if(cp.checkPrime(numbers[j]))
                System.out.print(numbers[j]+"  ");
        }

    }
}
