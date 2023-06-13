import java.util.*;

class PR_17_RomanToDecimal {
    int getDecimalVal(char s) {
        int val = 0;
        switch (s) {
            case 'I':
                val = 1;
                break;
            case 'V':
                val = 5;
                break;
            case 'X':
                val = 10;
                break;
            case 'L':
                val = 50;
                break;
            case 'C':
                val = 100;
                break;
            case 'D':
                val = 500;
                break;
            case 'M':
                val = 1000;
                break;
        }
        return val;
    }

    int convertToDecimal(String roman){
        int result = 0,c = 0;
        String romanValSub = "";
        for (int i = 0;i<roman.length();i++){
            if (i!=roman.length()-1 && (getDecimalVal(roman.charAt(i)) < getDecimalVal(roman.charAt(i+1)))){
                result = result + getDecimalVal(roman.charAt(i+1))-getDecimalVal(roman.charAt(i));
                i++;
            }

            else{
                result = result + getDecimalVal(roman.charAt(i));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        PR_17_RomanToDecimal romanToDecimal = new PR_17_RomanToDecimal();
        int a = romanToDecimal.convertToDecimal("VIII");
        System.out.println(a);
        // -1000+100 + 1000 + (-1+5)
        // -900 + 1000 + 4
        // 104
    }
}
