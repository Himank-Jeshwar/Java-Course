import java.util.*;
class PR_04_DecimalToBinary {
    String toBinary(int decimal){
        // declaration
        String revBin = "";
        String bin = "";
        // storing bits
        do{
            revBin+=decimal%2;
            decimal/=2;
        }while(decimal>0);

        // reversing string
        for (int i = revBin.length()-1;i>=0;i--){
            bin+=revBin.charAt(i);
        }

        return bin;
    }
    public static void main(String[] args) {
        int n;
        String binary;
        PR_04_DecimalToBinary decToBin = new PR_04_DecimalToBinary();
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter decimal : ");        
        n = sc.nextInt();

        binary = decToBin.toBinary(n);
        
        System.out.println("Binary Output : "+binary);
    }
}
