import java.util.*;
class UpperHalf {
    int A[][],size;
    
    public UpperHalf(int n){
        size = n;
        A = new int[n][n];
    }

    void fillarray(){
        Scanner sc = new Scanner (System.in);

        for (int i = 0;i<size;i++){
            System.out.print("Enter elements for row "+(i+1)+" : ");
            for (int j = 0;j<size;j++)
                A[i][j] = sc.nextInt();
        }
    }

    void displayOriginal(){
        System.out.println("Original Array : ");
        for (int i = 0;i<size;i++){
            for (int j = 0;j<size;j++)
                System.out.print(A[i][j]+" ");
            System.out.println();
        }
    }

    void displayUpperHalf(){
        System.out.println("\nOutput : ");
        for (int i = 0;i<size;i++){
            
            // for (int l = 0;l<i;l++)
            //     System.out.print(" ");

            for (int j = 0;j<size;j++)
                if (j>=i)
                    System.out.print(A[i][j]);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int s;
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter size of the array : ");
        s = sc.nextInt();

        UpperHalf ob = new UpperHalf(s);
        ob.fillarray();
        ob.displayOriginal();
        ob.displayUpperHalf();
    }
}
