import java.util.*;
class PR_07_Trans {
    int arr[][],m;

    public PR_07_Trans(int mm){
        m = mm;
        arr = new int [m][m];
    }

    void fillarray(){
        Scanner sc = new Scanner (System.in);
        for (int i = 0;i<m;i++){
            System.out.print("Enter elements for row-"+(i+1)+" ");

            for (int j = 0;j<m;j++)
                arr[i][j] = sc.nextInt();
        }
    }

    void transpose(){
        int trans [][] = new int [m][m];

        for (int i = 0;i<m;i++){
            for (int j = 0;j<m;j++)
                trans[i][j]=arr[j][i];
        }

        arr = trans;
    }

    void display(){
        System.out.println("Original matrix : ");
        for (int i = 0;i<m;i++){
            for (int j = 0;j<m;j++)
                System.out.print(arr[i][j]+" ");
            System.out.println();
        }

        transpose();

        System.out.println("Transposed matrix : ");
        for (int i = 0;i<m;i++){
            for (int j = 0;j<m;j++)
                System.out.print(arr[i][j]+" ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int mm;
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter size of the element : ");
        mm = sc.nextInt();

        PR_07_Trans ob = new PR_07_Trans(mm);
        ob.fillarray();
        ob.display();
    }
}
