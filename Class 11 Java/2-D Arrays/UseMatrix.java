import java.util.*;
class UseMatrix{
    public static void main(){
        int m,n;
        
        Scanner sc = new Scanner (System.in);
        System.out.print("M = ");
        m = sc.nextInt();
        
        System.out.print("N = ");
        n = sc.nextInt();
        
        if (Matrix.isValid(m,n)==true){
            Matrix ob = new Matrix(m,n);
            ob.input();
            ob.display();
        }
    }
}