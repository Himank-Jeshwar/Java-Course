import java.util.Scanner;

class NumberPattern9 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        n = sc.nextInt();

        for (int i = 1;i<=n;i++){
            for (int j = i;j>=1;j--){
                System.out.print(j);
            }
            for (int l = 2;l<=i;l++){
                System.out.print(l);
            }
            System.out.println();
        }
    }    
}
