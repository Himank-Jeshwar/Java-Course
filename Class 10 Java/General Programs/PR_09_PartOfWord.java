import java.util.*;
class PR_09_PartOfWord{
    public static void main(String args[]){
        String s,w="the";
        int len = 3,c=0;
        
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter string : ");
        s = sc.nextLine();
        
        // SOHAM
        // SOH
        // HAM
        for (int i = 0;i<=s.length()-len;i++){
            if (s.substring(i,i+len).equals(w))
                c++;
        }
        
        // output
        System.out.print("Number of \"the\" : "+c);
    }
}