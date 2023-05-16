import java.util.*;
class PR_03_CountLetter {
    public static void main(String[] args) {
        String s;
        int c = 0;
        Scanner sc = new Scanner (System.in);
        s = sc.nextLine().trim()+" ";

        for (int i = 0;i<s.length();i++){
            if (s.charAt(i)==' '){
                if (c>3)
                    System.out.println(s.substring(i-c,i));
                c = 0;   
            }
            else{
                c++;
            }
        }
    }    
}
