import java.util.*;
class PR_21_DoubleLetter {
    public static void main(String[] args) {
        String str,s;
        int c = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string : ");
        str = sc.nextLine();
        s = str;
        str = str.toUpperCase();

        for (int i = 0;i<str.length()-1;i++){
            if (str.charAt(i)==str.charAt(i+1))
                c++;
        }

        System.out.println("\nInput string : "+s);
        System.out.println("Converted string : "+str);
        System.out.println("Number of double sequences : "+c);
    }    
}
