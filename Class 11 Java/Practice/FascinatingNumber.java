import java.util.*;
class FascinatingNumber {
    int n;

    public FascinatingNumber(int x){
        n = x;
    }

    boolean isFascinating(){
        long result = Long.parseLong(n+""+(n*2)+""+(n*3));
        int c = 0;
        long copy = 0;

        for (int i = 1;i<=9;i++){
            c = 0;
            copy = result;
            
            while (copy>0){
                if (copy%10==i)
                    c++;
                copy/=10;
            }

            if (c!=1)
                return false;
        }

        return true;
    }

    void check(){
        if (isFascinating()==true)
            System.out.println(n+" is a Fascinating number.");
        else    
            System.out.println(n+" is not a Fascinating number.");
    }

    public static void main(String[] args) {
        int n ;

        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a number : ");
        n = sc.nextInt();

        FascinatingNumber ob = new FascinatingNumber(n);
        ob.check();
    }
}