import java.util.*;
class PR_18_SortingBoundaryMatrix{
    int arr[][],boundary[],m,n,len,pos[][];
    
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
    
    void store(){
        len = 2*(m+(n-2)); // defining length of boundary matrix
        pos = new int[len][2];
        boundary = new int [len];
        int ind = 0;
        int r = 0;
        // storing boundary in array
        for (int i = 0;i<m;i++){
            boundary[ind++] = arr[i][0];
            pos[r][0] = i;
            pos[r++][1] = 0;
            
            for (int j = 1;j<n-1;j++){
                if (i==0||i==m-1){
                    boundary[ind++] = arr[i][j];
                    pos[r][0] = i;
                    pos[r++][1] = j;
                }
            }
            boundary[ind++] = arr[i][n-1];
            pos[r][0] = i;
            pos[r++][1] = n-1;
        }
    }
    
    void sort(){
        int min = 0,t;
        
        for (int i = 0;i<len-1;i++){
            min = i;
            for (int j = i+1;j<len;j++)
                if (boundary[j]<boundary[min])
                    min = j;
            
            t = boundary[min];
            boundary[min] = boundary[i];
            boundary[i] = t;
        }
        
    }
    
    void restore(){
        int ind = 0;
        int row = 0,col = 0;
        
        for (int i = 0;i<len;i++){
            row = pos[i][0];
            col = pos[i][1];
            arr[row][col] = boundary[ind++];
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
            System.out.println(arr[i][n-1]+"\n");
        }
    }
     
    public static void main(String args[]){
        PR_18_SortingBoundaryMatrix ob = new PR_18_SortingBoundaryMatrix();
        ob.accept();
        System.out.println("Original Boundary Matrix : ");
        ob.display();
        
        System.out.println("Sorted Original Boundary Matrix : ");
        ob.store();
        ob.sort();
        ob.restore();
        ob.display();
    }
}