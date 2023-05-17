import java.util.Scanner;

class PR_16_PronicInRange {
    static boolean isPronic(int n){
        for (int i = 1;i<n;i++){
            if (i*(i+1)==n)
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Set upper limit :");
        n = sc.nextInt();

        System.out.println("Pronic numbers are : ");
        for (int i = 1;i<=n;i++){
            if (isPronic(i))
                System.out.println(i);
        }
        sc.close();
    }      
}
