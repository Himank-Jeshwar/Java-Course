// interface ConverterMethods{
//     double binaryToDecimal();
//     String decimalToBinary();
//     String hexToBinary();
//     double binaryToHex();
//     String octalToBinary();
//     double binaryToOctal();
//     double octalToHex();
//     double hexToOctal();
//     String textToBinary();
//     String binaryToText();
//     double textToOctal();
//     String hexToText();
//     double textToHex();
// }

import java.util.InputMismatchException;

class CompilerX{
    // 101
    // 1*2^2 + 0*2^1 + 1*2^0 = 4 + 0 + 1 = 5
    static int binaryToDecimal(String field)throws InputMismatchException{
        long binary = Long.parseLong(field);
        int decimal = 0;
        for (int i = 0;i<field.length();i++){
            if(binary%10==0||binary%10==1){
                decimal+=(binary%10)*Math.pow(2,i);
                binary/=10;
            }
            else 
                throw new InputMismatchException();            
        }
        return decimal;
    }

    static String decimalToBinary(int field){
        String binString = "";
        String binary = "";
        while (field>0){
            binString+=field%2;
            field/=2;
        }
        binString+="0"; // by convention, binary code begins with 0

        // obtaining final binary code
        for (int i = binString.length()-1;i>=0;i--)
            binary+=binString.charAt(i);
        return binary;
    }

    static String textToBinary(String field){
        String binary = "";
        for (int i = 0;i<field.length();i++)
            binary+=decimalToBinary((int)field.charAt(i))+" ";
        return binary;
    }

    static String binaryToText(String field)throws InputMismatchException{
        int ascii = 0;
        String text = "",w = "";
        field+=" ";
        for (int i = 0;i<field.length();i++){
            if (field.charAt(i)==' '){
                ascii = binaryToDecimal(w);
                text+=(char)(ascii);
                w="";
            }
            else 
                w+=field.charAt(i);
        }
        return text;
    }
    public static void main(String[] args) throws InputMismatchException{
        System.out.println(CompilerX.binaryToDecimal("01101"));
        System.out.println(CompilerX.decimalToBinary(13));
        System.out.println(CompilerX.textToBinary("Himank Jeshwar"));
        System.out.println(CompilerX.binaryToText("01001000"));
    }
}

