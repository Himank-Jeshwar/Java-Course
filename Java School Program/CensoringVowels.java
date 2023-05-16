import java.util.Scanner;
class CensoringVowels{
    String sentence;
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence :");
        sentence = sc.nextLine();
        sc.close();
    }
    void show(){
        String str = sentence.toLowerCase();
        for (int i = 0;i<str.length();i++){
            switch(str.charAt(i)){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    sentence = sentence.replace(sentence.charAt(i),'*');
            }
        }
        System.out.println("OUTPUT : "+sentence);
    }
    public static void main(String[] args) {
        CensoringVowels censor = new CensoringVowels();
        censor.input();
        censor.show();
    }
}