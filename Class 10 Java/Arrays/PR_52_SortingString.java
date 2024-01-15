import java.util.*;
class PR_52_SortingString {
    public static void main(String[] args) {
        String s,newStr="";
        char letters[],t;
        int min = 0;

        Scanner sc = new Scanner (System.in);
        System.out.print("Enter string : ");
        s = sc.nextLine().toLowerCase();

        letters = new char[s.length()];
        
        //storing in array
        for (int i = 0;i<letters.length;i++)
            letters[i] = s.charAt(i);

        // selection sort 
        for (int i = 0;i<letters.length-1;i++){
            min = i;
            for (int j = i+1;j<letters.length;j++)
                if (letters[j]<letters[min])
                    min = j;
            
            // swapping
            t = letters[min];
            letters[min] = letters[i];
            letters[i] = t;
        }

        // storing in a new string
        for (int i = 0;i<letters.length;i++)
            newStr+=letters[i];

        System.out.println("Sorted string : "+newStr);
    }
}
