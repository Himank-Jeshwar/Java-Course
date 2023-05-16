import java.util.*;
class PR_34_Pattern1 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        n = sc.nextInt();
        for (int i = 0,ch = 65;i<n;i++){
            for (int j = 0;j<=i;j++,ch++)
                System.out.print((char)ch+" ");
            System.out.println();
            ch--;
        }
    }    
}
