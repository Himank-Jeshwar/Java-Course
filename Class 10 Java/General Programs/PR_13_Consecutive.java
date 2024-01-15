import java.util.*;
class PR_13_Consecutive {
    public static void main(String args[]){
        String s,w = "",words = "";
        
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter string : ");
        s = sc.nextLine().toLowerCase().trim()+" ";
        
        for (int i = 0;i<s.length();i++){
            if (s.charAt(i)==' '){
                for (int j = 0;j<w.length()-1;j++){
                    if (Math.abs(w.charAt(j)-w.charAt(j+1))==1){
                        words+=w+"\n";
                        break;
                    }
                }
                w = "";
            }
            else
                w+=s.charAt(i);
        }
        
        System.out.println("Words having consecutive letters : \n"+words); 
    }
}