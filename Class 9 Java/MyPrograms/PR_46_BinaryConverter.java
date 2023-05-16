
import java.util.*;
import java.io.*;
class PR_46_BinaryConverter {

    static String toBinary(String s){
        // declaration
        String binary = "",rev = "",binaryOfLetter = "";
        int ascii = 0;

        for (int i = 0;i<s.length();i++){
            binaryOfLetter = "0"; // binary code starts with 0
            ascii = (int)(s.charAt(i));
            rev = "" ;

            while (ascii>=1){
                rev += (ascii%2);
                ascii/=2;
            }

            // reversing the variable rev to get the binary code
            for (int k = rev.length()-1;k>=0;k--){
                binaryOfLetter+=rev.charAt(k);
            }
            binary+=binaryOfLetter+" ";
        }

        return binary;
    }

    static String toText(String binary){
        // declaration
        int ascii = 0,c = 0;
        String text = "",binaryOfLetter = "";
        
        binary = binary.trim()+" ";

        for (int i = 0;i<binary.length();i++){
            if (binary.charAt(i)==' '){
                ascii = 0;
                binaryOfLetter = binary.substring(i-c, i).trim();
                c = 0;
                
                for (int j = 0;j<binaryOfLetter.length();j++){
                    ascii+=(int)((binaryOfLetter.charAt(j)-48)*(Math.pow(2,(binaryOfLetter.length()-1)-j)));
                }
                text+=(char)(ascii);
            }
            c++;
        }

        return text;
    }
    public static void main(String[] args)throws IOException {
        // declaration
        int ch;
;
        // input
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1 to convert to binary\nPress 2 to convert to text");
        ch = sc.nextInt();
        sc.nextLine();
        
        // decision
        switch(ch){
            case 1:
                String str;
                System.out.println("Enter text :-");
                str = sc.nextLine();
                System.out.println(toBinary(str));
                break;
            
            case 2:
                String str1;
                System.out.println("Enter binary code :-");
                str1 = sc.nextLine();
                System.out.println(toText(str1));
                break;

        }

    }
}
