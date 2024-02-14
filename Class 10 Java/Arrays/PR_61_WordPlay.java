import java.util.*;
class PR_61_WordPlay {
    public static void main(String[] args) {
        String w,newStr1="",newStr2="";
        int c = 0;

        Scanner sc = new Scanner (System.in);
        System.out.println("Enter word : ");
        w = sc.next();

        for (int i = 0;i<w.length();i++)
            if (Character.isLetter(w.charAt(i)))
                if ("AEIOUaeiou".indexOf(w.charAt(i))==-1) // is Consonant
                    c++;
                else
                    newStr1+=w.charAt(i); // for vowels

        for (int i = 0;i<w.length();i++){
            if (Character.isLetter(w.charAt(i))){
                if ("AEIOUaeiou".indexOf(w.charAt(i))!=-1){ // for vowels
                    newStr2+=w.charAt(i);
                }
                else{ // for consonants
                    newStr1+=w.charAt(i);
                    newStr2+='#';
                }
            }
            else // for any other character other than alphabet
                newStr2+=w.charAt(i);
        }

        System.out.println("Consonants : "+c);
        System.out.println("New string : "+newStr1);
        System.out.println("Replacing consonants with # : "+newStr2);
    }
}
