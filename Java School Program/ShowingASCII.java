import java.util.Scanner;
class ShowingASCII {
    String word;
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word : ");        
        word = sc.next();
        sc.close();
    }

    void display(){
        for (int i = 0;i<word.length();i++){
            System.out.println("ASCII of "+word.charAt(i)+" = "+(int)(word.charAt(i)));
        }
    }
    public static void main(String[] args) {
        ShowingASCII ascii = new ShowingASCII();
        ascii.input();
        ascii.display();
    }
}
