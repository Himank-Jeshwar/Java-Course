import java.util.Scanner;

class PR_29_DeletingVowels {
    public static void main(String[] args) {
        String s;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word : ");
        s = sc.next();

        for (int i = 0;i<s.length();i++){
            switch(s.charAt(i)){
                case 'a':case 'e':case 'i':case 'o':case 'u':
                case 'A':case 'E':case 'I':case 'O':case 'U':

                continue;
            }
            System.out.print(s.charAt(i));
        }
    }    
}
