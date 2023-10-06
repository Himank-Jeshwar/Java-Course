import java.util.*;
class PR_36_Diagonal{
    public static void main(String[] args) {
        int a[][] = {{4,2,1,4},
        	         {3,2,11,3},
                     {5,7,3,23},
                     {6,2,6,31}};
        int m = 4,sr=0,sl=0;

        // Scanner sc = new Scanner (System.in);
        // System.out.print("Enter dimension : ");
        // m = sc.nextInt();
        // a = new int[m][m];

        // for (int i = 0;i<a.length;i++){
        //     for (int j = 0;j<a[i].length;j++){
        //         System.out.println("Enter element ()"+i+","+j+":");
        //         a[i][j] = sc.nextInt();
        //     }
        // }
        
        for (int i = 0;i<a.length;i++){
            for (int j = 0;j<a[i].length;j++)
                System.out.print(a[i][j]+"\t");
            System.out.println();
        }
        System.out.println();

        System.out.println("Left diagonal : ");
        for (int i = 0;i<a.length;i++){
            for (int j = 0;j<i;j++)
                System.out.print("\t");
            for (int k = 0;k<a[i].length;k++){
                if (i==k){
                	System.out.print(a[i][k]);
                    sl+=a[i][k];
                }
            }
            System.out.println();
        }


        System.out.println("Right diagonal : ");
        for (int i = 0;i<a.length;i++){
            for (int j = m-1;j>i;j--)
                System.out.print("\t");
            for (int k = 0;k<a[i].length;k++){
                if (i+k==m-1){
                	System.out.print(a[i][k]);
                    sr+=a[i][k];
                }
            }
            System.out.println();
        }

        System.out.println("\nSum of left diagonal = "+sl);
        System.out.println("Sum of right diagonal = "+sr);
    }
}