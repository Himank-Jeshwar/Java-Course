import java.util.*;
class PR_20_Vowels{
    public static void main(String args[]){
        String s,vow="",newStr="",w="";
        
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter sentence : ");
        s = sc.nextLine().toUpperCase().trim()+" ";
        
        for (int i = 0;i<s.length();i++){
            if (s.charAt(i)==' '){
                if ("AEIOU".indexOf(w.charAt(0))!=-1)
                    if ("AEIOU".indexOf(w.charAt(w.length()-1))!=-1)
                        vow+=w+"\n";
                    else
                        newStr+=w+" ";
                else 
                    newStr+=w+" ";
                    
                w = "";
            }
            else
                w+=s.charAt(i);
        }
        
        System.out.println("Words starting and ending with vowels : \n"+vow);
        System.out.println("New Sentence : "+newStr);
    }
}