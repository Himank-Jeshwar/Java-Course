import java.util.*;
class PR_25_Vowels {
    public static void main(String[] args) {
        String s,newStr="";
        int ind=-1;

        Scanner sc = new Scanner (System.in);
        System.out.print("Enter string : ");
        s = sc.next().toUpperCase();

        // finding first occuring vowel
        for (int i = 0;i<s.length();i++){
            if ("AEIOU".indexOf(s.charAt(i))!=-1) {
                ind = i;
                break;
            }
        }

        if (ind==0)
            newStr=s+'Y';
        else    
            if (ind>0)
                newStr=s.substring(ind)+s.substring(0,ind+1)+'C';
            else
                newStr=s+'N';

        // output
        System.out.println("New string : "+newStr);
    }
}
