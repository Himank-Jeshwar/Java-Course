// Name - Himank Jeshwar
import java.util.*;
class UserSuffix{
    public static void main(){
        int n; // declaration
        Scanner sc = new Scanner (System.in);
        
        // input
        System.out.print ("Enter a number :");
        n = sc.nextInt();
        
        // validation before object creation
        if (Suffix.isValid(n)==true){
            Suffix ob = new Suffix(n);
            ob.printSuffix(n%10);
        }
        
        else 
            System.out.print("INVALID INPUT !");
    }
    
}