import java.util.*;
class PR_01_ReverseNumber{
    private int A[],size;
    
    public PR_01_ReverseNumber(int s){
        size = s;
        A = new int [s];
    }

    void fillarray(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter "+size+" numbers :");
        for (int i = 0;i<size;i++)
            A[i] = sc.nextInt();
    }

    private int reverse(int v){
        int rev = 0;
        while(v>0){
            rev = rev*10+v%10;
            v/=10;
        }
        return rev;
    }

    void findreverse(PR_01_ReverseNumber rb1){
        for (int i = 0;i<size;i++)
            A[i] = reverse(rb1.A[i]);
    }

    void display(){
        for (int i = 0;i<size;i++)
            System.out.print(A[i]+" ");
        System.out.println();
    }
}