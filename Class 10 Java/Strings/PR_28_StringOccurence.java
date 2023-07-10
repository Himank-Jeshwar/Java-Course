import java.util.*;
class PR_28_StringOccurence {
    int count (String st,String f){
        int len = f.length(); // declaration
        int c = 0;
        String w = "";

        for (int i = 0;i<st.length()-len;i++){
            w = st.substring(i,i+len);
            if (w.equals(f))
                c++;
        }
        return c;
    }

    public static void main(String[] args) {
        String s,f;
        PR_28_StringOccurence ob = new PR_28_StringOccurence();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        s = sc.nextLine().trim()+" ";
        System.out.print("Enter a word to search : ");
        f = sc.next();
        System.out.print("Number of times the word occurs : "+ob.count(s,f));
    }
}
