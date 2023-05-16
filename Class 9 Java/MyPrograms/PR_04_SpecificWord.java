import java.util.*;
public class PR_04_SpecificWord {
    public static void main(String[] args) {
        // declaration
        String words [] = new String[10];
        
        // inputs
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 words :- ");

        for (int i = 0;i<words.length;i++){
            words[i]=sc.next();
        }

        System.out.println("\nOUTPUT :");
        for (int j = 0;j<words.length;j++){
            if ((words[j].startsWith("A")||words[j].startsWith("a"))
            &&(words[j].endsWith("A")||words[j].endsWith("a"))){
             
                System.out.println(words[j]);
            }
        }
    }
}
