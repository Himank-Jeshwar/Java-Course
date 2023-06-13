import java.util.*;
class PR_18_NegativeFollowedByPositive {
    public static void main(String[] args) {
        int n[] = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 numbers : ");
        for (int i = 0;i<n.length;i++){
            n[i] = sc.nextInt();
        }

        // displaying negative numbers
        System.out.print("\nOutput : ");
        for (int j = 0;j<n.length;j++){
            if (n[j]<0)
                System.out.print(n[j]+" ");
        }

        for (int k = 0;k<n.length;k++){
            if (n[k]>0)
                System.out.print(n[k]+" ");
        }

    }   
}
