import java.util.*;
class PR_02_SentenceCase{
    public static void main(String []args){
        String s,st;
        int c = 0;
        
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter sentence : ");
        s = sc.nextLine();
        
        for (int i = 0;i<s.length();i++){
            if (s.charAt(i)>=65&&s.charAt(i)<=90)
                c++; // counting uppercase
        }
        
        s = s.toLowerCase();
        st = (char)(s.charAt(0)-32)+s.substring(1);
        System.out.println("Number of Uppercase letters : "+c);
        System.out.println(st);
    }
}