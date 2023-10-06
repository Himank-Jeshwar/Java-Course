import java.util.*;

class ASG_7_Duck {
    int n;
    
    void check (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 numbers : ");
        for (int i = 1;i<=10;i++){
            n = sc.nextInt();

            if (isValid(n)==true)
                if (isDuck(n)==true)
                    System.out.println("Duck number");
                else 
                    System.out.println("Not a Duck number");
        }
    }

    boolean isValid (int n){
        if (n>=95&&n<=1129)
            return true;
        System.out.println("INVALID INPUT");
        return false;
    }

    boolean isDuck (int n){
        while (n>0){
            if (n%10==0)
                return true;
            n/=10;
        }
        return false;
    }
    public static void main(String[] args) {
        ASG_7_Duck ob = new ASG_7_Duck();
        ob.check();
    }    
}
