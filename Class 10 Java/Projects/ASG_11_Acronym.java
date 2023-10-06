import java.util.*;
class ASG_11_Acronym {
    public static void main(String[] args) {
        String acro = "", s;

        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a sentence : ");
        s = sc.nextLine().trim();
        s = " "+s;

        for (int i = 0;i<s.length();i++)
            if (s.charAt(i)==' ')
                acro+=s.charAt(i+1);

        System.out.println("Acronym : "+acro);
    }
}
