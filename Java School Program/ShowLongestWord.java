import java.util.Scanner;
class ShowLongestWord {
    String sentence;
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence : ");
        sentence = sc.nextLine().trim()+" ";
        sc.close();
    }  
    
    void display(){
        int spaceIndex = 0;
        int length = 0,max = 0;
        for (int i = 0;i<sentence.length();i++){
            if (sentence.charAt(i)==' '){
                if (length>max){
                    spaceIndex = i;        
                    max = length;
                }
                length = 0;
            }
            else 
                length++;
        }
        System.out.println("Longest word : "+sentence.substring(spaceIndex-max,spaceIndex));
        System.out.println("Length of the longest word : "+max);
    }
    public static void main(String[] args) {
        ShowLongestWord longestWord = new ShowLongestWord();
        longestWord.input();
        longestWord.display();
    }
}
