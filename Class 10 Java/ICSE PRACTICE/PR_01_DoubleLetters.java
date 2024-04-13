import java.util.*;
class PR_01_DoubleLetters{
    public static void main(String args[]){
        String s;
        int c = 0;

        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a sentence : ");
        s = sc.nextLine().toUpperCase();

        for (int i = 0;i<s.length()-1;i++){
            if (s.charAt(i)==s.charAt(i+1))
                c++;
        }

        System.out.println("Number of double letters are : "+c);
    }
}