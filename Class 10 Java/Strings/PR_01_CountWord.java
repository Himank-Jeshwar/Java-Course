import java.util.*;
class PR_01_CountWord{
    public static void main(String []args){
        String s;
        int c = 0;
        
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter sentence : ");
        s = sc.nextLine().trim()+" ";
        
        for (int i = 0;i<s.length();i++){
            if (s.charAt(i)==' ')
                c++; // counting words
        }
        
        System.out.println("Number of words : "+c);
    }
}