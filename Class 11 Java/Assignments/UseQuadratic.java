import java.util.*;
class UseQuadratic{
    public static void main(){
        int a,b,c;
        
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter coefficient of a : ");
        a = sc.nextInt();
        System.out.print("Enter coefficient of b : ");
        b = sc.nextInt();
        System.out.print("Enter coefficient of c : ");
        c = sc.nextInt();
        
        Quadratic ob = new Quadratic (a,b,c);
        ob.compute();
    }
}