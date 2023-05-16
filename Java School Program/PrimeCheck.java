import java.io.*;
class PrimeCheck{
    int num;
    void input()throws IOException{
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        System.out.print("Enter a number : ");
        num = Integer.parseInt(br.readLine());
    }
    void isPrime (){
        boolean prime = false;
        if (num==2)
            System.out.print(num+" is a prime number.");
        else{
            for (int i = 2;i<num;i++){
                if (num%i==0){
                    prime = false;
                    break;
                }
                prime = true;
            }
            System.out.print((prime)?num+" is a prime number.":num+" is not a prime number.");
        }
    }
    public static void main(String[] args) throws IOException{
        PrimeCheck pc = new PrimeCheck();
        pc.input();
        pc.isPrime();
    }
}