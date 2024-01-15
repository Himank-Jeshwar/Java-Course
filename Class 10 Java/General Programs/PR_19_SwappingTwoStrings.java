import java.util.*;
class PR_19_SwappingTwoStrings{
    public static void main(String args[]){
        String s1 = "Himank";
        String s2 = "Jeshwar";
        
        // swapping of two strings
        s1 = (s2+" "+s1).trim();
        s2 = s1.substring(s1.indexOf(' ')+1);
        s1 = s1.substring(0,s1.indexOf(' '));
        
        System.out.print(s1+" "+s2);
    }
}