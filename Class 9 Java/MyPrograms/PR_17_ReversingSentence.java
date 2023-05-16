import java.util.Scanner;

class PR_17_ReversingSentence {
    public static void main(String[] args) {
        String word,sentence,newWord = "";
        int c = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sentence below :");
        sentence = sc.nextLine().trim()+" ";

        System.out.println("Reversed Sentence : ");
        for (int i = 0;i<sentence.length();i++){
            if (sentence.charAt(i)==' '){
                word = sentence.substring(i-c,i);
                for (int j = word.length()-1;j>=0;j--){
                    newWord += word.charAt(j);
                }
                newWord+=" ";
                c=0;
            }
            c++;
        }
        // 
        newWord = newWord.trim();
        newWord = " "+newWord;
        word = "";
        String newString = "";
        c=0;
        for (int i = newWord.lastIndexOf(' ');i<newWord.length();i++){
            word = newWord.substring(i+1,newWord.length());
            newWord = newWord.replaceAll(" "+word, "");

            System.out.print(word+" ");
            c++;
        }
    }    
}
