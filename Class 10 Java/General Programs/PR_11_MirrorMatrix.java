import java.util.*;
class PR_11_MirrorMatrix{
    int arr[][];
    
    public PR_11_MirrorMatrix(){
        arr = new int [3][4];
    }
    
    void accept(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter elements : ");
        
        for (int i = 0;i<3;i++){
            for (int j = 0;j<4;j++){
                arr[i][j] = sc.nextInt();
                
                if (arr[i][j]<0 || arr[i][j]>99){
                    System.out.print("INVALID INPUT");
                    System.exit(0);
                }
            }
        }
    }
    
    void mirror(){
        int temp;
        for (int i = 0;i<3;i++){
            for (int j = 0;j<=2;j++){
                temp = arr[i][4-j-1];
                arr[i][4-j-1] = arr[i][j];
                arr[i][j] = temp;
            }
        }
    }
    
    void display(){
        for (int i = 0;i<3;i++){
            for (int j = 0;j<4;j++)
                System.out.print(arr[i][j]+" ");
            System.out.println();
        }
    }
    
    public static void main(String args[]){
        PR_11_MirrorMatrix ob = new PR_11_MirrorMatrix();
        ob.accept();
        System.out.println("Original matrix :");
        ob.display();
        System.out.println("Mirror matrix : ");
        ob.mirror();
        ob.display();
    }
}