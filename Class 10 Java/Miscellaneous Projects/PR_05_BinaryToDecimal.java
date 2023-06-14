import java.util.*;
class PR_05_BinaryToDecimal {
    int toDecimal(String binary){
        int n = binary.length();
        int decimal = 0,j=0,val = 0;

        for (int i = n-1;i>=0;i--){
            if (binary.charAt(j)==49)
                val = 1;
            else 
                val = 0;

            decimal+=(int)(Math.pow(2,i)*val);
            j++;
        }

        return decimal;
    }

    public static void main(String[] args) {
        String bin;
        int dec;

        PR_05_BinaryToDecimal binDec = new PR_05_BinaryToDecimal();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter binary : ");
        bin = sc.next();

        dec = binDec.toDecimal(bin); 
        System.out.println("Decimal output : "+dec);
    }
}
