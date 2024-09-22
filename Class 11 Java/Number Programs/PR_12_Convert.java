class PR_12_Convert {
    static int toOctal(int decimal){
        int oct = 0,rem = 0;
        int i = 1;

        while (decimal!=0){
            rem = decimal%8;
            oct = rem*i+oct;
            i*=10;
            decimal/=8;
        }

        return oct;
    }
    
    static String toHex(int decimal){
        int rem = 0;
        int i = 1;
        char hexChar [] = {'0','1','2','3','4','5','6','7','8','9',
                       'A','B','C','D','E','F'};
        String hex = "";

        while (decimal!=0){
            rem = decimal%16;
            hex = hexChar[rem]+hex;
            i*=10;
            decimal/=16;
        }

        return hex;
    }
    public static void main(String[] args) {
        System.out.println(toOctal(21));
        System.out.println(toHex(623));
    }
}
