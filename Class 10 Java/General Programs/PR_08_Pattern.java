import java.util.*;
class PR_08_Pattern{
    public static void main(String args[]){
        String s;
        
        Scanner sc = new Scanner (System.in);
        System.out.print ("Enter string : ");
        s = sc.nextLine();
        
        for (int i = 0;i<s.length();i++){
            for (int j = s.length()-1;j>i;j--)
                System.out.print(" ");
            
            for (int k = i;k>=0;k--)
                System.out.print(s.charAt(k));
                
            for (int l = 1;l<=i;l++)
                System.out.print(s.charAt(l));
            
            System.out.println();
        }
    }
}