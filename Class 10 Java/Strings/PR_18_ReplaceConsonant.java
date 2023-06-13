import java.util.*;
class PR_18_ReplaceConsonant{
    static boolean isVowel(char ch){
        ch = Character.toLowerCase(ch);
        switch(ch){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String st,newSt="";
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter sentence : ");
        st = sc.nextLine();

        for (int i = 0;i<st.length();i++){
            if (Character.isLetter(st.charAt(i))&&isVowel(st.charAt(i))==false){
                if (isVowel((char)(st.charAt(i)-1)))
                    newSt+=(char)(st.charAt(i)+1);
                else
                    newSt+=(char)(st.charAt(i)-1);
            }
            else
                newSt+=st.charAt(i);
        }

        System.out.println(st);
        System.out.println(newSt);
    }
}