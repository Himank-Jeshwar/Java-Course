import java.util.*;
class PR_22_FilteringOddEven {
    void show(int a[]){
        for (int i = 0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }

    void input(int a[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter "+a.length+" elements : ");
        for (int i = 0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
    }
    public static void main(String[] args) {
        int arr[] = new int[10];
        int E[] = new int [10],O[] = new int [10];
        int evenInd = -1,oddInd = -1;
        Scanner sc = new Scanner (System.in);
        PR_22_FilteringOddEven ob = new PR_22_FilteringOddEven();
        
        ob.input(arr);

        for (int i = 0;i<arr.length;i++){
            if (arr[i]%2==0)
                E[++evenInd] = arr[i];
            else 
                O[++oddInd] = arr[i];
        }

        // printing
        System.out.print("\nEven array : ");
        for (int j = 0;j<=evenInd;j++){
            System.out.print(E[j]+" ");
        }

        System.out.print("\nOdd array : ");
        for (int j = 0;j<=oddInd;j++){
            System.out.print(O[j]+" ");
        }
        System.out.println();
    }
}
