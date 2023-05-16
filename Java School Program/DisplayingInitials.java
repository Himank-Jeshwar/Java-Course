import java.util.Scanner;
class DisplayingInitials {
    String sentence;
    void input(){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a sentence (only 3 words) :- ");
       sentence = sc.nextLine();    
       sc.close();
    }

    void showInitials(){
        System.out.print(sentence.charAt(0)+" ");
        for (int i = 0;i<sentence.length();i++){
            if (sentence.charAt(i)==' ')
                System.out.print(sentence.charAt(i+1)+" "); 
        }
    }
    public static void main(String[] args) {
        DisplayingInitials obj = new DisplayingInitials();
        obj.input();
        obj.showInitials();        
    }
}
