import java.util.Scanner;
class ShortForm {
    String sentence;
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence : ");
        sentence = sc.nextLine().trim()+" ";
        sc.close();
    }
    // Vital Information Resource Under Seize 
    // c = 38
    // length = 5
    // shortform = VIRUS

    void display(){
        String shortform = "";
        int length = 0,c = 0;
        for (int i = 0;i<sentence.length();i++){
            if (sentence.charAt(i)==' '){
                shortform+=sentence.charAt(c-length);
                length=0;
            }
            else
                length++;
            c++;
        }
        System.out.println("OUTPUT : "+shortform);
    }
    public static void main(String[] args) {
        ShortForm obj = new ShortForm();
        obj.input();
        obj.display();
    }
}
