import java.io.*;
class HarshadNumber {
    static int getSumofDigits(int num){
        int sum = 0;
        while(num>0){
            sum+=num%10;
            num/=10;
        }
        return sum;
    }
    static boolean isHarshadNumber(int num){
        boolean harshadNum = false;
        harshadNum = (num%getSumofDigits(num)==0)?true:false;
        return harshadNum;
    }    
    public static void main(String[] args)throws IOException {
        int n;
        InputStreamReader m = new InputStreamReader(System.in);
        BufferedReader w = new BufferedReader(m);
        System.out.print("Enter a number = ");
        n = Integer.parseInt(w.readLine());
        if (isHarshadNumber(n))
            System.out.println(n+" is a Multiple Harshad Number.");
        else
            System.out.println(n+" is not a Multiple Harshad Number.");
  
        }
        // 493 
}
