import java.util.Scanner;
class UniqueString {
    String word;
    int occurence(String str ,char letter){
        int count = 0;
        for (int i = 0;i<str.length();i++){
            if (str.charAt(i)==letter)
                count++;
        }
        return count;
    }
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence : ");
        word = sc.next();
        sc.close();
    }


    void display(){
        boolean isUnique = false;
        for (int i = 0;i<word.length();i++){
            if (occurence(word, word.charAt(i))>1){
                isUnique = false;
                break;
            }
            else 
                isUnique = true;
        }
        if (isUnique)
            System.out.println("Unique String");
        else
            System.out.println("Not a unique string.");
    }
    public static void main(String[] args) {
        UniqueString uniqueString = new UniqueString();
        uniqueString.input();
        uniqueString.display();
    }
}