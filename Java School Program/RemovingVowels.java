import java.util.Scanner;
class RemovingVowels {
    String word;
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word : ");
        word = sc.nextLine();
        sc.close();
    }
    void removeVowels(){
        String str = "";
        for (int i = 0;i<word.length();i++){
            switch(word.charAt(i)){
                case 'a':
                case 'A':
                case 'e':
                case 'E':
                case 'i':
                case 'I':
                case 'o':
                case 'O':
                case 'U':
                case 'u':
                    break;

                default:
                    str+=word.charAt(i);
            }
        }
        word = str;
        System.out.print("FINAL OUTPUT : "+word);
    }
    public static void main(String[] args) {
        RemovingVowels remVowels = new RemovingVowels();
        remVowels.input();
        remVowels.removeVowels();  
    }
}
