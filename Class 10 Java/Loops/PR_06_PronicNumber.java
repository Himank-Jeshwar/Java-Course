import java.util.Scanner;

class PR_06_PronicNumber {
    boolean isPronic(int n){
        for (int i = 1;i<n;i++){
            if (i*(i+1)==n)
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int n;
        PR_06_PronicNumber proObj = new PR_06_PronicNumber();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        n = sc.nextInt();

        if (proObj.isPronic(n))
            System.out.println("Pronic Number");
        else 
            System.out.println("Not a Pronic Number");
        
        sc.close();
    }    
}
