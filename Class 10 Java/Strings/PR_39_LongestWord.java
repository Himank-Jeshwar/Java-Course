import java.util.*;
class PR_39_LongestWord{
    public static void main(String[] args) {
        int min = Integer.MAX_VALUE,max = Integer.MIN_VALUE;
        String longest = "" , shortest = "",s,w = "";

        Scanner sc = new Scanner (System.in);
        System.out.print("Enter sentence : ");
        s = sc.nextLine().trim()+" ";

        for (int i = 0;i<s.length();i++){
            if (s.charAt(i)==' '){
                    if (w.length()<=min){
                        min = w.length();
                        shortest = w;
                    }

                    if (w.length()>=max){
                        max = w.length();
                        longest = w;
                    }
                
                w="";
            }
            else{
                if (Character.isLetter(s.charAt(i))==true||Character.isDigit(s.charAt(i))==true)
                    w+=s.charAt(i);
            }
        }
        System.out.println("Longest Word : "+longest+"\nLength : "+max+"\n");
        System.out.println("Shortest word : "+shortest+"\nLength : "+min);
}
}