import java.util.*;
class PR_15_BoundaryMatrix{
    int arr[][],m,n;
    
    void accept(){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter rows : ");
        m = sc.nextInt();
        System.out.print("Enter columns : ");
        n = sc.nextInt();    
        
        arr = new int [m][n];
        
        System.out.println("Enter elements : ");
        for (int i = 0;i<m;i++){
            for (int j = 0;j<n;j++){
                arr[i][j] = sc.nextInt();
                
                if (arr[i][j]<0||(arr[i][j]<10||arr[i][j]>99)){
                    System.out.println("Only Positive Two Digit Integers");
                    System.exit(0);
                }
            }
        }
    }
    
    void display(){
        for (int i = 0;i<m;i++){
            System.out.print(arr[i][0]+"\t");
            for (int j = 1;j<n-1;j++){
                if (i==0||i==m-1)
                    System.out.print(arr[i][j]+"\t");
                else
                    System.out.print("\t");
            }
            System.out.print(arr[i][n-1]+"\n");
            System.out.println();
        }
    }
    public static void main(String args[]){
         PR_15_BoundaryMatrix ob = new PR_15_BoundaryMatrix();
         ob.accept();
         ob.display();
    }
}