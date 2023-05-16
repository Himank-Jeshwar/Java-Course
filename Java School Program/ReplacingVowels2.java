import java.util.Scanner;
class ReplacingVowels2 {
    String sentence;
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence : ");
        sentence = sc.nextLine();
        sc.close();
    }

    void display(){
        String lower = sentence.toLowerCase();
        for (int i = 0;i<sentence.length();i++){
            switch(lower.charAt(i)){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    sentence = sentence.replace(sentence.charAt(i), '*');
                    break;
            }
        }
        System.out.println("OUTPUT : "+sentence);
    }
    public static void main(String[] args) {
        ReplacingVowels2 replaceVowels = new ReplacingVowels2();
        replaceVowels.input();
        replaceVowels.display();
    }    
}
