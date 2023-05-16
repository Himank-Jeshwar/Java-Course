import java.util.Scanner;

class PR_14_SumAndProduct {
    public static void main(String[] args) {
        // declaration
        double [][] n = new double [4][4];
        double sum = 0.0, product = 1.0;
        // input
        Scanner sc = new Scanner(System.in);
        for (int i = 0;i<n.length;i++){
            for (int j = 0;j<n[i].length;j++){
                System.out.print("Row "+i+" Column "+j+" : ");
                n[i][j] = sc.nextDouble();
            }
            System.out.println();
        }

        // calculation
        for (int l = 0;l<n.length;l++){
            for (int k = 0;k<n[l].length;k++){
                if (n[l][k]%2==0)
                    sum+=n[l][k];
                else 
                    product*=n[l][k];
            }
        }
// 
        System.out.println("Sum of all even numbers = "+(int)sum);
        System.out.println("Product of all odd numbers = "+(long)product);
    }    
}
