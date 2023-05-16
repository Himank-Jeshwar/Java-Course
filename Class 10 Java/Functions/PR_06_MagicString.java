import java.util.Scanner;
class PR_06_MagicString {
    void Magic(String str){
        for (int i = 0;i<str.length()-1;i++){
            if (str.charAt(i)+1==str.charAt(i+1)){
                System.out.println("It is a Magic String");
                return;
            }
        }
        System.out.println("It is not a Magic String");
    }  
    public static void main(String[] args) {
        String str; // declaration

        // instantiation
        PR_06_MagicString mg = new PR_06_MagicString();
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string : ");
        str = sc.next();

        mg.Magic(str); // checks whether a string is magic or not
    } 
}
