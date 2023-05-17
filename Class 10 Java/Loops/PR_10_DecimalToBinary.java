import java.util.*;
class PR_10_DecimalToBinary {
    String toBinary(int decimal){
        String revbin = "",bin = ""; // declaration
        // calculating bits
        while(decimal!=0){
            revbin+=(decimal%2);
            decimal/=2;
        }

        // reversing string
        for (int i = revbin.length()-1;i>=0;i--){
            bin+=revbin.charAt(i);
        }

        return bin;
    }    

    public static void main(String[] args) {
        int n;
        String binary;
        Scanner sc = new Scanner(System.in);
        PR_10_DecimalToBinary obj = new PR_10_DecimalToBinary();
        System.out.print("Enter a number (decimal) : ");
        n  = sc.nextInt();

        binary = obj.toBinary(n);
        System.out.print("Binary code : "+binary);
        sc.close();
    }
}
