import java.util.*;
class PR_08_RowsAdd_ColumnsMultiply {
    public static void main(String[] args) {
        // declaration
        int m,n,arr[][];
        int sum = 0;
        long product = 1;

        Scanner sc = new Scanner (System.in);
        System.out.print("Enter rows : ");
        m = sc.nextInt();
        System.out.print("Enter columns : ");
        n = sc.nextInt();

        arr = new int [m][n];
        for (int i = 0;i<arr.length;i++){
            System.out.println("\nRows "+(i+1)+":");
            for (int j = 0;j<arr[i].length;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int k = 0;
        for (int i = 0;i<arr.length;i++){
            
            for (int j = 0;j<arr[i].length;j++){
                sum+=arr[i][j];
                product*=arr[j][i];
            }
            // product*=arr[i][k];
        }
        System.out.println("Row sum : "+sum);
        System.out.println("Column product :"+product);
    }    
}
