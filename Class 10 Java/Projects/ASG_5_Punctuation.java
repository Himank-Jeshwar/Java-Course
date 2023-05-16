import java.util.*;
class ASG_5_Punctuation{
    public static void main(String[] args) {
        String str;
        char punc;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sentence :");
        str = sc.nextLine();

        punc = str.charAt(str.length()-1);

        switch(punc){
            case '.':
            case '!':
                System.out.print("Valid Statement");
                break;
            case '?':
                System.out.print("Valid Question");
                break;
            default:
                System.out.print("Invalid Statement");
        }
    }
}