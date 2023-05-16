import java.util.Scanner;

class PR_18_TDisplay {
    public static void main(String[] args) {

        String str; 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a str : ");
        // str = sc.nextLine();

        /*  method 1
        for (int i = 0;i<str.length();i++){
            if (str.charAt(i)=='.')
                break;
            else if (str.charAt(i)==' '){
                System.out.println();
                continue;
            }
            System.out.print(str.charAt(i)); 
        }
        */

        // method 2
        while (true){
            str = sc.next();
            if (str.equals("."))
                break;
            System.out.println(str);
        }
    }    
}
