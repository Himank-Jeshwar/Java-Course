import java.io.*;
public class ReversingString {
    String s;
    void input()throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a string : ");
        s = br.readLine();
    }

    void reverse(){
        for (int i = s.length()-1;i>=0;i--){
            System.out.print(s.charAt(i));
        }
        System.out.println();
    }

    int vowels (){
        int n = 0;
        for (int j = 0;j<s.length();j++){
            switch(s.charAt(j)){
                case 'A':
                case 'a':
                case 'E':
                case 'e':
                case 'I':
                case 'i':
                case 'O':
                case 'o':
                case 'U':
                case 'u':
                    n++;
            }
            
        }
        return n;
    }

    public static void main(String[] args)throws IOException {
        ReversingString rev = new ReversingString();
        rev.input();
        rev.reverse();
        System.out.print("Number of Vowels = "+rev.vowels());
    }
}
