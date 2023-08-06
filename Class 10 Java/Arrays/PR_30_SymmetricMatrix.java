import java.util.*;
class PR_30_SymmetricMatrix {
    boolean isSymmetric(int arr[][]){
        boolean isSym = true;
        for (int i = 0;i<arr.length;i++){
            for (int j = 0;j<arr[i].length;j++){
                if (arr[i][j]!=arr[j][i])
                    isSym = false;
            }
        }
        return isSym;
    }

    void input(int arr[][]){
        Scanner sc = new Scanner (System.in);
        for (int i = 0;i<arr.length;i++){
            for (int j = 0;j<arr[i].length;j++){
                System.out.print("Enter element : ("+i+","+j+") : ");
                arr[i][j] = sc.nextInt();
            }
        }
    }
    public static void main(String[] args) {
        PR_30_SymmetricMatrix ob = new PR_30_SymmetricMatrix();
        int arr[][] = new int[3][3];
        System.out.println(arr);

        if (ob.isSymmetric(arr))
            System.out.println("Symmetric Matrix");
        else 
            System.out.println("Not a Symmetric Matrix");

    }
}
