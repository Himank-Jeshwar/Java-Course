import java.util.*;
class ASG_14_Frequency{
    public static void main(String[] args) {
        // declaration
        String str,word;
        int c = 0;    
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter word to search : ");
        word = sc.next();
        do{
            str = sc.next();
            if (str.equals(word))
                c++;
        }while(!(str.equals(".")));

        System.out.println("Frequency of the word : "+c);
    }
}