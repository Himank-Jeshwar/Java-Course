import java.util.*;
class UsePattern{
    public static void main(){
        int n;
        
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter n : ");
        n = sc.nextInt();
        
        if (Pattern.isValid(n)==true){
            Pattern ob = new Pattern (n);
            ob.Floyd();
        }
    }
}