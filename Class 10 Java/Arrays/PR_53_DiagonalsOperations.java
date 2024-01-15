import java.util.*;
class PR_53_DiagonalsOperations {
    int num[][];

    // vowels,consonants,symbols

    // sorting 

    // palindrome nos.
    // prime nos.

    void countOccurence(){
        char ch[][] = {{'c','a','!','s','t'},
                       {'#','X','i','z','y'},
                       {'w','_','j','f','k'},
                       {'o','d','*','s','y'},
                       {'x','?','o','e','b'}};

        String c = "",v = "",s="";
        for (int i = 0 ;i<ch.length;i++){
            for (int j = 0;j<ch[i].length;j++){
                if (i==j||i+j==ch.length-1)
                    continue;

                if (Character.isLetter(ch[i][j])==false&&Character.isDigit(ch[i][j])==false)
                    s+=ch[i][j];
                if (Character.isLetter(ch[i][j])==true)
                    if ("AEIOUaeiou".indexOf(ch[i][j])==-1)
                        c+=ch[i][j];
                    else
                        v+=ch[i][j];
            }
        }

        System.out.println("Vowels : "+v+"\tcount = "+v.length());
        System.out.println("Consonants : "+c+"\tcount = "+c.length());
        System.out.println("Symbols : "+s+"\tcount = "+s.length());
    }

    public static void main(String[] args) {
        PR_53_DiagonalsOperations ob = new PR_53_DiagonalsOperations();
        ob.countOccurence();    
    }
}
