import java.util.*;
class PR_04_Matrix {
    int m[][];

    void getData(){
        m = new int [3][3];
        Scanner sc = new Scanner(System.in);

        for (int i = 0;i<m.length;i++){
            for (int k = 0;k<m[i].length;k++){
                System.out.print("Enter "+i+","+k+"th element : ");
                m[i][k] = sc.nextInt();
            }
        }
    }

    void rowsum(){
        int sum;
        for (int i = 0;i<m.length;i++){
            sum = 0;
            for (int j = 0;j<m[i].length;j++){
                sum+=m[i][j];
            }
            System.out.println("Sum of row "+(i+1)+" = "+sum);
        }
        System.out.println();
    }

    void colsum(){
        int sum;
        for (int i = 0;i<m.length;i++){
            sum = 0;
            for (int j = 0;j<m[i].length;j++){
                sum+=m[j][i];
            }
            System.out.println("Sum of column "+(i+1)+" = "+sum);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        PR_04_Matrix mtx = new PR_04_Matrix();
        mtx.getData();
        mtx.rowsum();
        mtx.colsum();
    }
}