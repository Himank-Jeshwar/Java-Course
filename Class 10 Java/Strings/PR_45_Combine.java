import java.util.*;
public class PR_45_Combine {
    public static void main(String[] args) {
        String s1,s2,newStr = "";
        int c1 = 0,c2 = 0;

        Scanner sc = new Scanner (System.in);
        System.out.print("Enter string 1 : ");
        s1 = sc.next().toUpperCase();
        System.out.print("Enter string 2 : ");
        s2 = sc.next().toUpperCase();

        if (s1.length()==s2.length()){
            for (int i = 0;i<s1.length();i++){
                newStr+=s1.charAt(i);
                newStr+=s2.charAt(i);
            }
            System.out.println("New Word : "+newStr);
        }
        else{
            for (int i = 0;i<s1.length();i++)
                if ("AEIOU".indexOf(s1.charAt(i))==-1) // is consonant
                    c1++;
            
            for (int i = 0;i<s2.length();i++)
                if("AEIOU".indexOf(s2.charAt(i))==-1) // is consonant
                    c2++;
            
            System.out.println("Number of consonants in string 1 : "+c1);
            System.out.println("Number of consonants in string 2 : "+c2);
        }
    }
}
