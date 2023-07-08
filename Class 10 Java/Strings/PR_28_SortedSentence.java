import java.util.*;
class PR_27_SortingSentence {
    public static void main(String[] args) {
        int c = 0;
        String s;
        String st="",p,q;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sentence : ");
        s = sc.nextLine().trim();
        s = " "+s;
        String word1,word2="";
        for (char ch = 'A';ch<='Z';ch++){
            for (int i = 0;i<s.length();i++){
                int k=0;
                if (s.charAt(i)==' '){                                    
                    word1 = s.substring(i-c, i);
                    for (int j = i+1;j<s.length()-1;j++){
                        if (s.charAt(j)==' '){
                            word2 = s.substring(j-k, k);
                            if (word1.charAt(0)<word2.charAt(0))
                                st+=word1;
                            else 
                                st+=word2;
                            k = 0;
                        }
                        else 
                            k++;
                    }
                    c=0;
                }

                else 
                    c++;
            }

        }
        System.out.println("Old word : "+s);
        System.out.println("Sorted word :"+st);
    }    
}
