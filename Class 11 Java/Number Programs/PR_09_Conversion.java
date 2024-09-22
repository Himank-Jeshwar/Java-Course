class PR_09_Conversion {
    String input;
    
    public PR_09_Conversion(String input){
        this.input = input;
    }

    String fromDecimalTo(int base){
        String convert = "";
        int decimal = Integer.parseInt(input);
        String letters = "ABCDEF";

        while(decimal!=0){
            // binary = (decimal%base)*i+binary;
            if (decimal%base<10)
                convert = (decimal%base)+convert;
            else
                convert = letters.charAt(decimal%base-10)+convert;
            decimal/=base;
        }

        return convert;
    }

    String octalToBinary(){
        String binary = "",k="";
        PR_09_Conversion ob ;

        int octal = Integer.parseInt(input);
        while (octal>0){
            k = String.valueOf(octal%10);
            ob = new PR_09_Conversion(k);
            binary = ob.fromDecimalTo(2)+binary;
            octal/=10;
        }
        return binary;
    }

    int binaryToDecimal(){
        int decimal = 0;
        int bit = 0;
        for (int i = 0;i<input.length();i++){
            bit = input.charAt(i)-48; // converting to integer
            decimal += bit*Math.pow(2, input.length()-i-1);
        }
        return decimal;
    }
    
