import java.util.*;
class PR_32_ConsecutivePairs {
    public static void main(String[] args) {
        String s;
        int c = 0;
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a sentence : ");
        s = sc.nextLine();

        System.out.println("Consecutive pairs : ");
        for (int i = 0;i<s.length()-1;i++){
            if (s.charAt(i)+1==s.charAt(i+1)){
                System.out.println(s.charAt(i)+","+s.charAt(i+1));
                c++;
            }
        }
        System.out.println("Number of consecutive pairs : "+c);
    }   
}
