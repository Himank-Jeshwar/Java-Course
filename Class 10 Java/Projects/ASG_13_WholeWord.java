import java.util.*;
class ASG_13_WholeWord {
    public static void main(String[] args) {
        String s,w,extWrd="";
        int freqWhole = 0,totalFreq = 0,len = 0;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter sentence : ");
        s = sc.nextLine().trim()+" ";
        System.out.print("Enter word : ");
        w = sc.next();
        len = w.length();

        for (int i = 0;i<=s.length()-len;i++){
            if (w.equalsIgnoreCase(s.substring(i,i+len)))
                totalFreq++;
        }

        for (int j = 0;j<s.length();j++){
            if (s.charAt(j)==' '){
                if (w.equalsIgnoreCase(extWrd))
                    freqWhole++;
                extWrd = "";
            }
            else 
                extWrd+=s.charAt(j);
        }


        System.out.println("Frequency of Whole W ords : "+freqWhole);
        System.out.println("Frequency of "+w+" : "+totalFreq);
    }    
}
