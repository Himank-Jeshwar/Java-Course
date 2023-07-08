import java.util.*;
class PR_27_SortingWord {
    public static void main(String[] args) {
        String s;
        String st="";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter word: ");
        s = sc.next();

        for (char ch = 'A';ch<='Z';ch++){
            for (int i = 0;i<s.length();i++){
                if (Character.toUpperCase(s.charAt(i))==ch){
                    st+=s.charAt(i);
                }
            }
        }
        System.out.println("Old word : "+s);
        System.out.println("Sorted word :"+st);
    }    
}
