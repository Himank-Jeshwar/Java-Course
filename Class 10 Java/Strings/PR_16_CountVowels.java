import java.util.*;
class PR_16_CountVowels {
    public static void main(String[] args) {
        // declaration
        String st;
        int vowels = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string : ");
        st = sc.nextLine();

        for (int i = st.length()-1;i>=0;i--){
            System.out.print(st.charAt(i));
            switch(Character.toLowerCase(st.charAt(i))){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    vowels++;
            }
        }
        System.out.print("\nNo. of vowels = "+vowels);
    }    
}
