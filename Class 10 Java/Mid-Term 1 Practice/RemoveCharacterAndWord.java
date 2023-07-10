import java.util.*;
class RemoveCharacterAndWord {
    String remove(String s,char ch){
        String newStr = "";
        for (int i = 0;i<s.length();i++){
            if (s.charAt(i)==ch)
                continue;
            newStr+=s.charAt(i);
        }
        return newStr;
    }

    String remove(String s,String f){
        int c = 0;
        String newStr = "";
        String w = "";
        for (int i = 0;i<s.length();i++){
            if (s.charAt(i)==' '){
                w = s.substring(i-c,i);
                c=0;
                if (w.equals(f))
                    continue;
                newStr+=w+" ";
            }
            else 
                c++;
        }
        return newStr;
    }

    public static void main(String[] args) {
        String s,w,newSt;
        int ch;
        char c;

        RemoveCharacterAndWord ob = new RemoveCharacterAndWord();
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a string : ");        
        s = sc.nextLine().trim()+" ";

        System.out.println("Press 1 to remove word from a string\nPress 2 to remove a character from string.");
        ch = sc.nextInt();

        switch(ch){
            case 1:
                System.out.print("Enter word : ");
                w = sc.next();
                newSt = ob.remove(s,w);
                System.out.println("Old string : "+s);
                System.out.println("New string : "+newSt);
                break;

            case 2:
                System.out.print("Enter character : ");
                c = sc.next().charAt(0);
                newSt = ob.remove(s,c);
                System.out.println("Old string : "+s);
                System.out.println("New string : "+newSt);
                break;
            
            default:
                System.out.print("INVALID INPUT.");
        }
    }
}
