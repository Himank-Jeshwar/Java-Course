import java.util.*;

class PR_26_RemoveDuplicates {
    static int countOccurence(String word,String s){
        int c = 0,n = 0;
        String w;
        for (int i = 0;i<s.length();i++){
            if (s.charAt(i)==' '){
                w = s.substring(i-c, i);
                
                if (word.equals(w))
                    n++;
                
                c=0;
            }
            else {
                c++;
            }
        }
        return n;
    }

    static boolean isPresent(String word,String [] arr){
        for (int i = 0;i<arr.length;i++){
            if (word.equals(arr[i]))
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String s,word,newStr="";
        String  duplicates[];
        int c = 0;

        Scanner sc = new Scanner (System.in);
        System.out.println("Enter sentence : ");
        s = sc.nextLine().trim()+" ";
        duplicates = new String [s.length()];

        for (int i = 0;i<s.length();i++){
            if (s.charAt(i)==' '){
                word = s.substring(i-c, i);
                if (!(isPresent(word, duplicates)))
                    newStr+=word+" ";

                if (countOccurence(word, s)>1)
                    duplicates[i] = word;
                
                c=0;
            }
            else {
                c++;
            }
        }
        System.out.println("\n"+s);
        System.out.println(newStr);
    }    
}
