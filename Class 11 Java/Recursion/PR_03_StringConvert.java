import java.util.*;
class PR_03_StringConvert {
    static String convert (String x,int i){
        if (i==0)
            return ""+Character.toUpperCase(x.charAt(0));
        else
            return convert(x,i-1)+Character.toUpperCase(x.charAt(i));
    }

    public static void main(String[] args) {
        String s = "himank jeshwar";
        System.out.print(convert(s, s.length()-1));
    }
}
