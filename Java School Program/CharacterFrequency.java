import java.util.Scanner;

class CharacterFrequency {
    String sentence;
    int alphabets[];
    CharacterFrequency(){
        alphabets = new int [26];
    }
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sentence : ");
        sentence = sc.nextLine();
        sentence = sentence.toLowerCase();
        sc.close();
    }
    void frequency(){
        int index = 0;
        System.out.println("LETTER\tFREQUENCY");
        for (int i = 0;i<sentence.length();i++){
            if (sentence.charAt(i)!=' '){
                index = ((int)(sentence.charAt(i)))-97;
                alphabets[index]++;
            }
        }
        for (int k = 0;k<alphabets.length;k++) {
            if (alphabets[k]!=0)
                System.out.println((char)(k+65)+"\t"+alphabets[k]);
        }
    }
    public static void main(String[] args) {
        CharacterFrequency freq = new CharacterFrequency();
        freq.input();
        freq.frequency();
    }
}
