import java.util.*;
class PR_46_PartOfWord{
    public static void main(String[] args) {
        String s1,s2,w="";
        int ind = -1,len=0;
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter sentence : ");
        s1 = sc.nextLine().toUpperCase().trim()+" ";

        System.out.print("Enter a word to search : ");
        s2 = sc.next().toUpperCase();
        len = s2.length();
        // ACKNOWLEDGE
        // ACK  - 0  = w.substring(0,0+3) = 0,3 = 0,1,2
        // CKN  - 1  = w.substring(1,1+3) = 1,4 = 1,2,3
        // KNO  - 2  = w.substring(2,2+3) = 2,5 = 2,3,4
        // NOW  - 3    .
        // OWL  - 4    .
        // WLE  - 5    .
        // LED  - 6    .
        // EDG  - 7    .
        // DGE  - 8    w.substring(j,j+len)

        // GED
   // 12-3 = 9 =
        outer:
         for (int i = 0;i<s1.length();i++){
            if (s1.charAt(i)==' '){
                // System.out.println(s2.length());
                if (w.equals(s2)==false){
                    for (int j = 0;j<=w.length()-len;j++){
                        if (w.substring(j,j+len).equals(s2)){
                            ind = j;
                            break outer;
                        }
                    }
                }
                w = "";
            }
            else
                w+=s1.charAt(i);
        }

        System.out.println("It begins at : "+ind);
    }
}