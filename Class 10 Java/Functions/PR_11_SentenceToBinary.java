import java.util.Scanner;

class PR_11_SentenceToBinary {

    String charToBinary(char ch){
        int ascii = 0;// declaration
        String copy = "" ,binary = "";
        // storing bits
        ascii = (int)ch;
        while (ascii!=0){
            copy+=ascii%2;
            ascii/=2;
        }
           
        // reversing string to get final binary code
        for (int i = copy.length()-1;i>=0;i--){
            binary+=copy.charAt(i);
        }

        return binary;
    }
    public static void main(String[] args) {
        String bin,txt;
        Scanner sc = new Scanner(System.in);
        PR_11_SentenceToBinary toBinary = new PR_11_SentenceToBinary();
        System.out.println("Enter sentence : ");
        txt = sc.nextLine();
        
        // converting text to binary
        for (int i = 0;i<txt.length();i++){
            bin = toBinary.charToBinary(txt.charAt(i)); 
            System.out.print(bin+" ");
        }
    }    
}
