import java.util.*;
class PR_21_ReplaceWithReverse {
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

    int reverse(int n){
        int rev = 0;
        while(n>0){
            rev = rev*10+(n%10);
            n/=10;
        }
        System.out.println(rev);
        return rev;
    }//1
    // 0+3 = 3
    // 3*10+2 = 32
    // 32*10+
    public static void main(String[] args) {
        // declaration
        int n,num,temp;
        int A[];
        PR_21_ReplaceWithReverse ob = new PR_21_ReplaceWithReverse();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        n = sc.nextInt();
        
        A = new int [n]; // initializing array
        ob.input(A);

        System.out.print("Enter a number : ");
        num = sc.nextInt();
 
        // sorting array using bubble sort
        for (int i = 0;i<A.length;i++){
            for (int j = 0;j<A.length-i-1;j++){
                if (A[j]>A[j+1]){
                    temp = A[j+1];
                    A[j+1] = A[j];
                    A[j] = temp;
                }
            }
        }

        for (int i = 0;i<A.length;i++){
            if (A[i]<num)
                A[i] = ob.reverse(A[i]);
        }

        ob.show(A);
    }    
}
