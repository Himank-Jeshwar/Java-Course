import java.util.*;
class PR_21_TheTossingGame {
    public static void main(String[] args) {
        int n,toss,n_heads = 0,n_tails = 0; // declaration
        double loss = 0.0,gain = 0.0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter limit of tosses : ");
        n = sc.nextInt();

        // 0 - for head
        // 1 - for tail

        for (int i = 0;i<n;i++){
            System.out.println("Press any key : ");
            sc.next();
            toss = (int)(Math.random()*2); 
            
            if (toss==0){
                loss+=1.5;
                System.out.println("OOPS! Its a head, you lost 1.5rs");
                n_heads++;
            }
            else{ 
                gain+=2.0;
                System.out.println("HURRAY! Its a tail, you gained 2.0rs");
                n_tails++;
            }
        }
        System.out.println("Number of heads : "+n_heads);
        System.out.println("Number of tails : "+n_tails);
        System.out.println("Amount you gained : Rs."+gain);
        System.out.println("Amount you lost : Rs."+loss);
    }    
}
