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



class CompilerX{
    static double binaryToDecimal(String field){
        long value = Long.parseLong(field);
        long binary = value;
        double decimal = 0.0; int digits = 0;
        while(value>0){
            value/=10;
            digits++;
        }
// 2^0 * 1 + 2^1*0 + 2^2 *1 = 1+0+4 =   
        for (int i = 0;i<digits;i++,binary/=10){
            decimal = (Math.pow(2,i)*(binary%10));
        }
        return decimal;
    }
    public static void main(String[] args) {
        System.out.println(CompilerX.binaryToDecimal("101"));
        
    }
}

