import java.util.*;
class PR_08_ReversingSentence {
    public static void main(String[] args) {
        String st,word="",copy;
        int c = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sentence : ");
        st = " "+sc.nextLine().trim();
        
        for (int i = st.length()-1;i>=0;i--){
            if (st.charAt(i)==' '){
                word = st.substring(i, i+c+1).trim();
                
                System.out.print(word+" ");
                word = "";
                c = 0;
            }
            else {
                c++;
                // word = st.charAt(i)+word;
    
    }    
}
    }
}