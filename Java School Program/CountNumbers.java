import java.io.*;
class CountNumbers{
    public static void main(String[] args)throws IOException {
        // declaration
        int positiveNum = 0 , negativeNum = 0,sum_of_PostiveNum = 0,sum_of_NegativeNum = 0;
        int num;
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(inp);    
        System.out.println("Enter 50 numbers below :-");
        for (int i = 1;i<=50;i++){
            num = Integer.parseInt(br.readLine());
            if (num>0){
                positiveNum++;
                sum_of_PostiveNum+=num;
            }
            else 
                if (num<0){
                    negativeNum++;
                    sum_of_NegativeNum+=num;
                }
        }
        System.out.println("Number of Positive numbers : "+positiveNum);
        System.out.println("Number of Negative numbers : "+negativeNum);
        System.out.println("Sum of Positve Numbers : "+sum_of_PostiveNum);
        System.out.println("Sum of Negative Numbers : "+sum_of_NegativeNum);
    }
}