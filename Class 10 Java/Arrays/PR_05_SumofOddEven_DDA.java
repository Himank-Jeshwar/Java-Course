import java.util.*;
class PR_05_SumofOddEven_DDA{
    public static void main(String[] args) {
        // declaration
        int N [][] = new int [4][4];
        Scanner sc = new Scanner (System.in);
        int sum_odd = 0,sum_even = 0;
        
        // taking inputs
        for (int i = 0;i<4;i++){
            System.out.println("\nRow : "+(i+1)+":");
            for (int j = 0;j<4;j++){
                N[i][j]=sc.nextInt();
            }
        }
        sc.close();
        // calculating
        for (int i = 0;i<4;i++){
            for (int j = 0;j<4;j++){
                if (N[i][j]%2==0)
                    sum_even+=N[i][j];
                else
                    sum_odd+=N[i][j];
            }
        }

        System.out.println("Sum of odd numbers : "+sum_odd);
        System.out.println("Sum of even numbers : "+sum_even);
        
    }
}