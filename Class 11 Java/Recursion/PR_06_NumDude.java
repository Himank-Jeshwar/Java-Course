import java.util.*;
class PR_06_NumDude {
    int num;
    
    public PR_06_NumDude(){
        num = 0;
    }

    void input (){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter number : ");
        num = sc.nextInt();
    }

    int sumDigits(int x){
        if (x==0)
            return 0;
        return (x%10)+sumDigits(x/10);
    }

    void isDude(){
        if ((int)(Math.pow(sumDigits(num),3))==num)
            System.out.println(num+" is a Dudeney number.");
        
        else 
            System.out.println(num+" is not a Dudeney number.");

    }

    public static void main(String[] args) {
        PR_06_NumDude ob = new PR_06_NumDude();
        ob.input();
        ob.isDude();
    }
}
