import java.util.Scanner;

class PR_16_SortAndMissing {
    public static void main(String[] args) {
        // declaration
        String word,sortedWord="",alphabets = "";
        char ch;

        //input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word : ");
        word = sc.next();


        //sorting
        for (char i = 'A';i<='Z';i++){
            for (int j = 0;j<word.length();j++){
                if (Character.toUpperCase(word.charAt(j))==i)
                    sortedWord+=word.charAt(j);
            }
        }
        ch = sortedWord.charAt(0);
        for (char c = ch;c<=sortedWord.charAt(sortedWord.length()-1);c++){
                alphabets+=c;
        }
        
        System.out.println(sortedWord);
        System.out.println(alphabets);
        
 
    }    
}
