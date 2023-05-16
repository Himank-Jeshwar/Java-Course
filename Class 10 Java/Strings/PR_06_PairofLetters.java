import java.util.*;
class PR_06_PairofLetters {
    public static void main(String[] args) {
        String st;
        int c = 0;
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter sentence : ");
        st = sc.nextLine().toUpperCase();

        for (int i = 0;i<st.length()-1;i++){
            if (st.charAt(i+1)==st.charAt(i)+1)
                c++;
        }
        System.out.println("Number of words containing consecutive letters : "+c);
    }
}
