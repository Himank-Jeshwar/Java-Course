import java.util.*;
class PR_11_LowerLeftHalf {
    static void drawPattern(int [][]arr){
        for (int i = 0;i<arr.length;i++){
            for (int j = 0;j<arr[i].length;j++){
                if (i==j){
                    for (int k = 0;k<=j;k++){
                        System.out.print(arr[i][k]+" ");
                    }
                }
            }
            System.out.println();
        }
        
    }

    static void showMatrix(int [][]arr){
        for (int i = 0;i<arr.length;i++){
            for (int j = 0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int n,arr[][];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter dimension : ");
        n = sc.nextInt();

        arr = new int [n][n];

        for (int i = 0;i<arr.length;i++){
            for (int j = 0;j<arr[i].length;j++){
                System.out.format("Enter (%d,%d)th element : ",i,j);
                arr[i][j] = sc.nextInt();
            }
        }
        showMatrix(arr);
        System.out.println();
        drawPattern(arr);        
    }    
}
