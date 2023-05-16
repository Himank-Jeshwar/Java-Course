import java.util.*;
class PR_05_CountWordANdValidSentence{
    public static void main(String[] args) {
        String st,word,extractedWord="";
        int c = 0,occur = 0,index=0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sentence : ");
        st = sc.nextLine().toUpperCase();
        if (!(st.endsWith(".")||st.endsWith("!"))){
            System.out.println("Invalid Statement");
            System.exit(0);
        }
        index = st.endsWith(".")?st.indexOf('.'):st.indexOf('!');
        System.out.print("Enter word : ");
        word = sc.next().toUpperCase();
        st = st.substring(0, index).trim()+" ";
        for (int i = 0;i<st.length();i++){
            if (st.charAt(i)==' '){
                extractedWord = st.substring(i-c,i);
                if (extractedWord.equals(word))
                    occur++;
                c=0; // counter for word length
                extractedWord="";
            }
            else
                c++;
        }
        
        System.out.println("Occurence : "+occur);
        
    }
}