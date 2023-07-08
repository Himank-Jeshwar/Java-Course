import java.util.*;
class PR_20_Numbers {
    long number;
    PR_20_Numbers(long number){
        this.number = number;
    }
    boolean IsMersenne(){
        long k = 1;
        long i;
    
        do{
            i = (long)(Math.pow(2,k)-1);
            if (i==number)
                return true;
            k++;
        }while (i<=number);
        return false;
    }

    boolean IsDoubleMersenne(){
        long k = 1;
        long i;

        do{
            i = (long)(Math.pow(2,Math.pow(2, k)-1)-1);
            if (i==number)
                return true;
            k++;
        }while(i<=number);

        return false;
    }

    void genMersenneNos(){
        long i;
        long k = 1;
        System.out.println("List of Mersenne numbers are : ");
        do{
            i = (long)(Math.pow(2,k)-1);
            System.out.print(i+" ");
            k++;
        }while(k<=10);
    }

    void genDoubleMersseneNos(){
        long i;
        long k = 1;
        System.out.println("List of Double Mersenne numbers are : ");
        do{
            i = (long)(Math.pow(2,Math.pow(2, k)-1)-1);
            System.out.print(i+" ");
            k++;
        }while(k<=10);
    }
    public static void main(String[] args) {
        long n;
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter number : ");
        n = sc.nextLong();

        PR_20_Numbers ob = new PR_20_Numbers(n);

        // check for mersenne number
        if (ob.IsDoubleMersenne()){
            System.out.println("It is a Double Mersenne number.");
            ob.genDoubleMersseneNos();
        }
            
        else if (ob.IsMersenne()){
            System.out.println("It is a mersenne number.");
            ob.genMersenneNos();
        }
        else 
            System.out.println("It is neither a mersenne nor double mersenne number");
        }    
}
