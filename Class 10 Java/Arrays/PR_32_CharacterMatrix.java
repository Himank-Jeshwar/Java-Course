import java.util.*;
class PR_32_CharacterMatrix{
    boolean isVowel(char ch){
        String vowels = "AEIOUaeiou";
        if (vowels.indexOf(ch)!=-1)
            return true;
        return false;
    }
    int countVowels(char a[][]){
        int n = 0;
        for (int i = 0;i<a.length;i++){
            for (int j = 0;j<a[i].length;j++)
                if (isVowel(a[i][j]))
                    n++;
        }
        return n;
    }
    public static void main(String[] args) {
        // char ch[][] = new char[4][4];
        char ch [][] = {{'a','c','d','e'},
                        {'f','h','i','j'},
                        {'k','m','o','p'},
                        {'e','b','z','w'}};
        PR_32_CharacterMatrix ob = new PR_32_CharacterMatrix();
        char vowels[]  = new char[ob.countVowels(ch)],consonants[] = new char[16-ob.countVowels(ch)];
        char newCh[][] = new char[4][4];
        int p = 0,q = 0,row=0,col=0;
        // p -> vowels index
        // q -> consonants index

        Scanner sc = new Scanner (System.in);
        for (int i = 0;i<ch.length;i++){
            for (int j = 0;j<ch[i].length;j++){
                if (ob.isVowel(ch[i][j])){
                    vowels[p] = ch[i][j];
                    p++;
                }
                else {
                    consonants[q] = ch[i][j];
                    q++;
                }
            }
        }
        p = 0; q = 0;
        outer:
        for (int i = 0;i<newCh.length;i++){
            for (int j = 0;j<newCh[i].length;j++){
                newCh[i][j] = vowels[p];
                p++;
                if (p==vowels.length){
                    row = i;
                    col = j;
                    break outer;
                }
            }
        }        
        
        for (int i = row;i<newCh.length;i++){
            if (i==row){
                for (int j = col+1;j<newCh[i].length;j++){
                    newCh[i][j] = consonants[q];
                    q++; 
                }
            }
            else{
                for (int j = 0;j<newCh[i].length;j++){
                    newCh[i][j] = consonants[q];
                    q++; 
                }
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