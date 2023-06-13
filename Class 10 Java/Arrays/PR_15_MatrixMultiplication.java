import java.util.*;
class PR_15_MatrixMultiplication{
    static void takeUserInput(int arr[][]){
        Scanner sc = new Scanner(System.in);
        for (int i = 0;i<arr.length;i++){
            for (int j = 0;j<arr[i].length;j++){
                System.out.format("Enter (%d,%d)th element : ",i,j);
                arr[i][j] = sc.nextInt();
            }
        }
    }
    public static void main(String[] args) {
        int A[][],B[][],AB[][];
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter rows and columns for A in order : ");
        A = new int [sc.nextInt()][sc.nextInt()];
        System.out.println("Enter rows and columns for B in order : ");
        B = new int [sc.nextInt()][sc.nextInt()];

        System.out.println("Enter elements for matrix A:");
        takeUserInput(A);
        System.out.println("Enter elements for matrix B:");
        takeUserInput(B);

        if (A[0].length!=B.length){
            System.out.println("Cannot perform multiplication on these matrices.");
            System.exit(0);
        }

        AB = new int [A.length][B[0].length];
        for (int i = 0 ;i<AB.length;i++){
            for (int j = 0;j<AB[i].length-1;j++){
                AB[i][j] = A[i][j]*B[j][i] + A[i][j]*B[i][j+1];
                System.out.print(AB[i][j]+" ");
            }
            System.out.println();
        }
    }
}