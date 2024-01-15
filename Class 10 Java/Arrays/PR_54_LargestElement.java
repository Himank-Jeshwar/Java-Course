import java.util.*;
class PR_54_LargestElement {
    int m,n,arr[][];

    boolean isPresent (int el){
        for (int i = 0;i<m;i++)
            for (int j = 0;j<n;j++)
                if (el==arr[i][j])
                    return true;
        return false;
    }
    void accept (){
        int el;

        Scanner sc = new Scanner (System.in);
        System.out.print("Enter row = ");
        m = sc.nextInt();
        System.out.print("Enter columns = ");
        n = sc.nextInt();

        if ((m>=3&&m<=9)==false||(n>=3&&n<=9)==false){
            System.out.println("INVALID INPUT !");
            System.exit(0);
        }

        arr = new int[m][n]; // allocation
        System.out.println("Enter elements below : ");
        // input
        for (int i = 0;i<m;i++){
            for (int j = 0;j<n;j++){
                el = sc.nextInt();
                if (isPresent(el)==true){
                    System.out.println("No Duplicates allowed");
                    System.exit(0);
                }

                arr[i][j] = el;
            }
        }
    }

    void printLocation(){
        int max = Integer.MIN_VALUE;
        int row = -1,col = -1;
        for (int i = 0;i<m;i++){
            for (int j = 0;j<n;j++){
                if (arr[i][j]>max){
                    max = arr[i][j];
                    row = i;
                    col = j;
                }
            }
        }

        System.out.println("Largest element : "+max);
        System.out.println("Row = "+row+"\tColumn = "+col);
    }
    public static void main(String[] args) {
        PR_54_LargestElement ob = new PR_54_LargestElement();
        ob.accept();
        ob.printLocation();        
    }
}
