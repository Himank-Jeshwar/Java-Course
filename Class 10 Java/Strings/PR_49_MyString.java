import java.util.*;
class PR_49_MyString {
    static void pattern(String s){
        for (int i = s.length()-1;i>=0;i--)
            System.out.println(s.substring(i));
    }
    static String initials1(String s){
        String str="";
        s = s.trim();
        s = " "+s;
        for (int i = 0;i<s.length();i++)
            if (s.charAt(i)==' ')
                str+=s.charAt(i+1)+".";

        return str;
    }

    static void initials2(String s){
        String str = s.substring(0,s.lastIndexOf(' '));
        String initials = initials1(str)+s.substring(s.lastIndexOf(' ')+1);
        System.out.println(initials);
    }

    static void toggle (String s){
        String newStr = "";
        
        for (int i = 0;i<s.length();i++){
            if (Character.isLetter(s.charAt(i))){
                if (Character.isUpperCase(s.charAt(i)))
                    newStr+=(char)(s.charAt(i)+32);
                else    
                    newStr+=(char)(s.charAt(i)-32);
            }
            else
                newStr+=s.charAt(i);
        }
        System.out.println(newStr);
    }

    static void countVowelsCharactersReverse(String s){
        int v = 0,c = s.length();
        String rev="";

        for (int i = 0;i<s.length();i++){
            if ("AEIOUaeiou".indexOf(s.charAt(i))!=-1) // is vowel
                v++;
            rev = s.charAt(i)+rev;
        }
        System.out.println("Number of characters : "+c);
        System.out.println("Number of vowels : "+v);
        System.out.println("Reversed string :"+rev);
    }
    public static void main(String[] args) {
        // pattern("TRIAL");
        // initials1("AJAY PRATAP SINGH");
        // initials2("AJAY PRATAP SINGH RATHORE");
        toggle("WelComE TO School");
    }
}
