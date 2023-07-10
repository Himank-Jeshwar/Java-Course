import java.util.*;
class MixedNumbers {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter 3 numbers : ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if (a==b&&b==c&&c==a)
            System.out.println("They all are equal.");
        else
            if (a>Math.max(b,c))
                System.out.println("Greatest number : "+a);
            else 
                if (b>Math.max(a,c))
                    System.out.println("Greatest number : "+b);
                else 
                    System.out.println("Greatest number : "+c);
        
        if (a<0&&b<0&&c<0)
            System.out.println("All negative");
        else 
            if (a>0&&b>0&&c>0)
                System.out.println("All positive");
            else 
                System.out.println("Mixed numbers");
    }
}
