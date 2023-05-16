import java.util.Scanner;

class PR_11_FirstLetter {
    public static void main(String[] args) {
        String sentence,word,newSentence="";
        char letter=' ';
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence :");
        sentence = " "+sc.nextLine().toLowerCase().trim(); 
        // i = 11 c = 5
        for (int i = 0;i<sentence.length();i++){
            if (sentence.charAt(i)==' '){
                letter =  sentence.charAt(i+1);
                letter = Character.toUpperCase(letter);
                newSentence+=sentence.charAt(i)+""+letter;
            }    
            
            else {
                if (letter!=Character.toUpperCase(sentence.charAt(i)))
                    newSentence+=sentence.charAt(i);
            }
       
    }
    newSentence = newSentence.trim();
    System.out.println(newSentence);
    }
}