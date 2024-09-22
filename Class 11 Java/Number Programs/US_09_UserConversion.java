import java.util.*;

import javax.swing.text.html.StyleSheet;
class US_09_UserConversion {
    public static void main(String[] args) {
        String inp;
        int ch;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter input : ");
        inp = sc.next();

        PR_09_Conversion ob = new PR_09_Conversion(inp);

        ch = sc.nextInt();

        switch(ch){
            case 1:
                System.out.println("Binary : "+ob.fromDecimalTo(2));
                break;
            case 2:
                System.out.println("Octal : "+ob.fromDecimalTo(8));
                break;
            case 3:
                System.out.println("Hexadecimal : "+ob.fromDecimalTo(16));
                break;
            case 4 :
                System.out.println("Octal to binary : "+ob.octalToBinary());
                break;
            case 5:
                System.out.println("Binary to decimal : "+ob.binaryToDecimal());
        }
    }
}
