import java.util.*;
public class PR_04_HappyWord {
    public static void main(String[] args) {
        String word,wordNum = "";
        long wordInt = 0L,result = 0L,copy;

        Scanner sc = new Scanner (System.in);
        System.out.print("Enter word : ");
        word = sc.next().toUpperCase();

        for (int i = 0;i<word.length();i++){
            wordNum+=word.charAt(i)-64;
        }
        
        wordInt = Long.parseLong(wordNum); // converting to long
        
        do{
            copy = wordInt;
            result = 0;
            // System.out.println(wordInt);
            while(copy>0){
                result+=((copy%10)*(copy%10));
                copy/=10;
            }

            wordInt = result;
            if (wordInt%10==wordInt&&wordInt!=1){
                System.out.print("Not a Happy Word");
                System.exit(0);
            }
           
        }while(wordInt!=1);

        System.out.print("A happy word ");
    }   
}
