import java.util.*;
class PR_11_ShowPalindrome {
    static boolean isPalindrome(String s){
        String rev = "";
        for (int i = s.length()-1;i>=0;i--){
            rev+=s.charAt(i);
        }
        return(s.equals(rev));
    }
    public static void main(String[] args) {
        String st[]= new String [10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 words : ");

        //input
        for (int i = 0;i<st.length;i++){
            st[i] = sc.next();
        }

        //printing
        System.out.println("\nPalindrome words : ");
        for (int i = 0;i<st.length;i++){
            if (isPalindrome(st[i]))
                System.out.println(st[i]);
        }
    }
}
