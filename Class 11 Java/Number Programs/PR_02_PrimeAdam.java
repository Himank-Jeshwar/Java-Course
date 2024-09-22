import java.util.*;

class PR_02_PrimeAdam {
    int m,n;
    void input(){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter m : ");
        m = Math.abs(sc.nextInt());
        System.out.print("Enter n : ");
        n = Math.abs(sc.nextInt());
    }
    
    boolean isPrime(int num){

        for (int i = 2;i<=num/2;i++){
            if (num%i==0 && num!=2)
                return false;
            }    
            
        return (num!=1 && num!=0)?true:false;
        
    }

    int reverse(int num){
        int rev = 0;
        while (num>0){
            rev = rev*10+num%10;
            num/=10;
        }
        return rev;
    }

    boolean isAdam(int num){
        int sq1 = num*num;
        int sq2 = reverse(num)*reverse(num);

        if (reverse(sq1)==sq2)
            return true;
        return false;
        
    }    

    void display(){
        int c = 0;
        System.out.println("Prime Adam integers are :- ");

        for (int i = m;i<=n;i++){
            if (isPrime(i) && isAdam(i)){
                System.out.println(i);
                c++;
            }
        }

        System.out.println("Frequency of prime adam integers is : "+c);
    }
    public static void main(String[] args) {
        PR_02_PrimeAdam ob = new PR_02_PrimeAdam();
        ob.input();
        ob.display();
    }    
}
