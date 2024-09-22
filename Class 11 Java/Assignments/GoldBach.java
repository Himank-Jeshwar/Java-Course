import java.util.*;

class GoldBach {
    int n; // declaration

    public GoldBach(){
        n = 0;
    }

    void input(){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number : ");
        n = Math.abs(sc.nextInt()); // converting to positive integer
    }

    boolean isGoldBach(){
        int c = 0; 

        for (int i = 0;i<=n/2;i++){
            if (i%2==1 && (n-i)%2==1){
                System.out.println(i+" + "+(n-i));
                c++; // counter for combinations
            }
        }
        return (c>0);
    }
    
    void display(){
        if (isGoldBach()==true) // check
            System.out.println(n+" IS A GOLDBACH NUMBER .");
        
        else 
            System.out.println(n+" IS NOT A GOLDBACH NUMBER .");
    }
    public static void main() {
        GoldBach ob = new GoldBach();
        ob.input();
        ob.display();       
    }    
}
