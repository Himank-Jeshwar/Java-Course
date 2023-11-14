import java.util.*;
class PR_36_OverloadedFunc {
    void fun(String s){
        System.out.println("Substrings\n");
        for (int i = 0;i<s.length();i++){
            System.out.print(s.charAt(i));
            if (i<s.length()-1){
                if (s.charAt(i)==s.charAt(i+1)){
                    System.out.println(s.charAt(i+1));
                    i++;
                }
            }
            
        }
    }

    String fun(String s,char c){
        String newStr = "";
        if (s.indexOf(c)!=-1) // if c is in s
            for (int i = 0;i<s.length();i++)
                if (s.charAt(i)==c)
                    if ("AEIOUaeiou".indexOf(c)!=-1)// if c is vowel
                        newStr+='y';
                    else // not vowel
                        newStr+=(char)(((c-96-1)%26+97)+1); // refer to ex copy for clarity
                else
                    newStr+=s.charAt(i);
        else
            newStr = s;

        return newStr;
    }
    public static void main(String[] args) {
        PR_36_OverloadedFunc ob = new PR_36_OverloadedFunc();
        // ob.fun("Successfully");
        System.out.println(ob.fun("runner",'e'));
        System.out.println(ob.fun("successfully",'u'));
        System.out.println(ob.fun("determined",'m'));        
    }
}
