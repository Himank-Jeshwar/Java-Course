import java.util.*;
class PR_10_NonRepeat{
    public static void main(String args[]){
        String s,newStr="",checked="";
        PR_10_NonRepeat ob = new PR_10_NonRepeat();
        
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter string : ");
        s = sc.nextLine().toLowerCase();
        
        for (int i = 0;i<s.length();i++){
            if (checked.indexOf(s.charAt(i))==-1){
                newStr+=s.charAt(i);
                checked+=s.charAt(i);
            }
        }
                
        // output
        System.out.print("New string : "+newStr);
    }
}