import java.util.*;
class PR_48_UniqueString {
    public static void main(String args[]){
        String s,w="";
        int c = 0,flag = 1;

        Scanner sc = new Scanner (System.in);
        System.out.print("Enter string : ");
        s = sc.nextLine().trim()+" ";

        System.out.println("The unique words are :: ");
        for (int i = 0;i<s.length();i++){
            if (s.charAt(i)==' '){
                for (char ch = 'a';ch<='z';ch++){
                    c = 0;
                    for (int j = 0;j<w.length();j++)
                        if (Character.toLowerCase(w.charAt(j))==ch)
                            c++;
                    
                    if (c>1){
                        flag = 0;
                        break;
                    }
                }

                if (flag==1)
                    System.out.println(w);

                w="";                
            }
            else 
                w += s.charAt(i);
        }
    }
}
