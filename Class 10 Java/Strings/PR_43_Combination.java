import java.util.*;
class PR_43_Combination {
    public static void main(String[] args) {
        String w;
        int len;

        Scanner sc = new Scanner (System.in);
        System.out.print("Enter word : ");
        w = sc.next();
        len = w.length();

        for (int i = 0;i<len;i++){
            for (int j = 0;j<len;j++){
                for (int k = 0;k<len;k++){
                    if (i!=j&&j!=k&&i!=k)
                        System.out.println(w.charAt(i)+""+w.charAt(j)+""+w.charAt(k));
                }
            }
        }
    }
}

