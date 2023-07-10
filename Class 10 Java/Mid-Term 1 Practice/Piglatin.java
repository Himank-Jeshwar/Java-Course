import java.util.*;
class Piglatin {
    boolean isVowel(char ch){
        switch(ch){
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String s,newStr = "";
        int index = 0;
        Piglatin ob = new Piglatin();
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a word : ");
        s = sc.next().toUpperCase();

        for (int i = 0;i<s.length();i++){
            if (ob.isVowel(s.charAt(i))){
                index = i;
                break;
            }
        }

        newStr = s.substring(index)+s.substring(0,index)+"AY";
        System.out.println("Input : "+s);
        System.out.println("Output : "+newStr);
    }    
}
