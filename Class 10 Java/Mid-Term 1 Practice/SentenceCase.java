import java.util.*;
class SentenceCase {
    public static void main(String[] args) {
        String s,newStr="",w="";
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter sentence : ");
        s = sc.nextLine().toLowerCase().trim()+" ";

        for (int i = 0;i<s.length();i++){
            if (s.charAt(i)==' '){
                if (Character.isLetter(w.charAt(0)))
                    newStr+=(char)(w.charAt(0)-32)+w.substring(1)+" ";
                w = "";
            }
            else 
                w+=s.charAt(i);
        }

        System.out.println("Old sentence : "+s);
        System.out.println("New sentence : "+newStr);
    }    
}
