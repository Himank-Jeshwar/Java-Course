import java.io.*;
class ReplacingVowels{
    public static void main(String[] args)throws IOException {
        String word,newWord="";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a word - ");
        word = br.readLine();
        word = word.toLowerCase();

        for (int i = 0;i<word.length();i++){
            char letter = word.charAt(i);
            switch(letter){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    letter = (char)(word.charAt(i)+1);
                    break;
                default:
                    letter = word.charAt(i);
            }
            newWord+=letter;
        }
        System.out.println(newWord);
    }
}