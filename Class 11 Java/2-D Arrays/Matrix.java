import java.util.*;
class Matrix{
    int a[][],m,n;
    
    public Matrix(int x,int y){
        m = x;
        n = y;
        a = new int[m][n];
    }
    
    static boolean isValid(int x,int y){
        if ((x>0 && x<10) && (y>2&&y<6))
            return true;
        System.out.println("Out of range");
        return false;
    }
    
    void input(){
        Scanner sc = new Scanner (System.in);
        
        for (int i = 0;i<m;i++){
            System.out.print("Enter elements for row "+(i+1)+": ");
            for (int j = 0;j<n;j++){
                a[i][j] = sc.nextInt();
                
                if ((a[i][j]>=0 && a[i][j]<=7)==false){
                    System.out.println("Must be (0-7)!");
                    j--;
                }
            }
        }
    }
    
    void decimalequivalent(){
        int num = 0;
        for (int i = 0;i<m;i++){
            num = 0 ;
            
            for (int j = 0;j<n;j++)
                num+=a[i][j]*Math.pow(8,n-j-1);
                
            System.out.println(num);
        }
    }
    
    void display(){
        System.out.println("Filled Matrix :");
        for (int i = 0;i<m;i++){
            for (int j =0;j<n;j++)
                System.out.print(a[i][j]+" ");
            System.out.println();
        }
        
        System.out.println("Decimal equivalent");
        decimalequivalent();
    }
    }
