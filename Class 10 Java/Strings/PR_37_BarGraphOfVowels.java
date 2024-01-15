import java.util.*;
class PR_37_BarGraphOfVowels{
    String s;

    void input (){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a sentence : ");
        s = sc.nextLine().toUpperCase().trim();
    }

    void show (){
        String vowels = "",consonants = "",w = "";
        if (s.endsWith(".")||s.endsWith("?")||s.endsWith("!")){
            s = s.substring(0,s.length()-1)+" "; // removing the terminators and adding space
            for (int i = 0;i<s.length();i++){
                if (s.charAt(i)==' '){
                    for (int j = 0;j<w.length();j++) // for storing frequency of vowels
                        if ("AEIOU".indexOf(w.charAt(j))!=-1)
                            vowels+='V';
                        else
                            consonants+='C';

                    System.out.println(w+"\t"+vowels+"\n\t"+consonants+"\n");
                    w = "";
                    vowels = "";
                    consonants = "";
                }

                else
                    w+=s.charAt(i);
            }
        }    

        else
            System.out.println("INCORRECT TERMINATING CHARACTER. INVALID INPUT.");
    }
    public static void main(String[] args) {
        PR_37_BarGraphOfVowels ob = new PR_37_BarGraphOfVowels();
        ob.input();
        ob.show();       
    }
}