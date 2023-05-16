import java.util.Scanner;

public class PR_03_NivenNumber {
    int n;
    void input (){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a number :");
        n = sc.nextInt();
    }

    void display(){
        int copy = n,sum = 0;
        while (copy>0){
            sum+=copy%10;
            copy/=10;
        }
        if (n%sum==0)
            System.out.println(n+" is a Niven Number.");
        else 
            System.out.println(n+" is not a Niven Number.");
    }
    public static void main(String[] args) {
        PR_03_NivenNumber nivenNumber = new PR_03_NivenNumber();
        nivenNumber.input();
        nivenNumber.display();
    }
}
