import java.util.*;
class PR_44_Pairs {
    public static void main(String[] args) {
        int a[] ,n,num;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array :");
        n = sc.nextInt();
        System.out.print("Enter a number : ");
        num = sc.nextInt();

        a = new int [n];

        System.out.println("Enter elements in the array : ");
        for (int i = 0;i<n;i++)
            a[i] = sc.nextInt();

        System.out.println("Pairs : ");
        for (int i = 0;i<n-1;i++){
            for (int j = i+1;j<n;j++)
                if (a[i]+a[j]==num)
                    System.out.println(a[i]+" + "+a[j]+" = "+num);
        }
    }
}
