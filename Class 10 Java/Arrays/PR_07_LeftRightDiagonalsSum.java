import java.util.*;

class PR_07_LeftRightDiagonalsSum {
    public static void main(String[] args) {
        int m,n;
        int arr[][];
        int sum = 0;
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter rows : ");
        m = sc.nextInt();
        System.out.print("Enter columns : ");
        n = sc.nextInt();

        if (m!=n){
            System.out.println("Rows and columns must be same.");
            System.exit(0);
        }
        arr = new int [m][n];
        for (int i = 0;i<arr.length;i++){
            System.out.println("\nRow "+(i+1)+":");
            for (int j = 0;j<arr[i].length;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0;i<arr.length;i++){
            for (int j = 0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
                if (i+j==m-1)
                    sum+=arr[i][j];
            }
            System.out.println();
            sum+=arr[i][i];
        }
        System.out.println("Sum = "+sum);
    }

}
