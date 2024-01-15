import java.util.*;
class PR_38_SortingString {
    public static void main(String[] args) {
        String s,newWrd = "",w="",newStr="";

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string : ");
        s = sc.nextLine().toUpperCase().trim()+" ";

        for (int i = 0;i<s.length();i++){
            if (s.charAt(i)==' '){
                for (char j = 'A';j<='Z';j++)
                    for (int k = 0;k<w.length();k++)
                        if (w.charAt(k)==j)
                            newWrd+=j;

                newStr+=newWrd+" ";
                newWrd="";
                w="";
            }
            else
                w+=s.charAt(i); 
        }

        // output
        System.out.println("Sorted string : "+newStr);
    }
}
