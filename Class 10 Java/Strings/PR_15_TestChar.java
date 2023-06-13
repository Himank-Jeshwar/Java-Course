import java.util.*;
class PR_15_TestChar{

    boolean isLetter(char ch){
        if ((ch>=65&&ch<=90)||(ch>=97&&ch<=122))
            return true;
        return false;
    }
    public static void main(String[] args) {
        String st,altered = "",msg="";
        char ch; int index = -1;

        PR_15_TestChar testChar = new PR_15_TestChar();
    
        Scanner sc = new Scanner (System.in);

        do{
            System.out.println("Enter sentence : ");
            st = sc.nextLine();
        }while(!(st.endsWith(".")||st.endsWith("!")||st.endsWith("?")));
    
        do {
            System.out.println("Enter a character : ");
            ch = sc.next().charAt(0);
        }while(!(testChar.isLetter(ch)));

        for (int i = 0;i<st.length();i++){
            if (st.charAt(i)!=ch)
                altered+=st.charAt(i);
            else{
                index = i;
                msg = msg+(i+1)+" ";
            }
        }
        
        System.out.println(altered);
        if (index==-1)
            System.out.println(ch+" not found.");
        else
            System.out.println(ch+" found at "+msg);
    }
}