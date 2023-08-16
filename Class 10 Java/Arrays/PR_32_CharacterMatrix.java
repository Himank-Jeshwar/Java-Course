// pending

import java.util.*;
class PR_32_CharacterMatrix{
    boolean isVowel(char ch){
        String vowels = "AEIOUaeiou";
        if (vowels.indexOf(ch)!=-1)
            return true;
        return false;
    }
    public static void main(String[] args) {
        // char ch[][] = new char[4][4];
        char ch [][] = {{'a','c','d','e'},
                        {'f','h','i','j'},
                        {'k','m','o','p'},
                        {'e','b','z','w'}};
        String vowels = "",consonants = "";
        char newCh[][] = new char[4][4];
        int p = 0,q = 0,k=0,l=0;
        PR_32_CharacterMatrix ob = new PR_32_CharacterMatrix();

        Scanner sc = new Scanner (System.in);
            
        for (int i = 0;i<ch.length;i++){
            for (int j = 0;j<ch[i].length;j++){
                if (ob.isVowel(ch[i][j])==true)
                    vowels+=ch[i][j];
                else 
                    consonants+=ch[i][j];
            }
        }
            
        System.out.println(vowels);
        System.out.println(consonants)
        
        outer:
        for (int i = 0;i<newCh.length;i++){
            for (int j = 0;j<newCh[i].length;j++){
                newCh[i][j] = vowels.charAt(p);
                p++;
                l = j;
                if (p+1==vowels.length())
                    break outer;
            }
            k = i;
        }
        // if (l==4)
        //     k++;
        for (int i = k;i<newCh.length;i++){
            for (int j = l+1;j<newCh[i].length;j++){
                newCh[i][j] = consonants.charAt(q);
                q++;
            }
        }
        for (int i = 0;i<newCh.length;i++){
            for (int j = 0;j<newCh[i].length;j++){
                System.out.print(newCh[i][j]+" ");
            }
            System.out.println();
        }
    }
}