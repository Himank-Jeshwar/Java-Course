import java.util.*;
class PR_02_Season{
    public static void main(String[] args) {
        int m;
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter month number : ");
        m = sc.nextInt();
        if (m>=1&&m<=12){
            if (m==12||m==1||m==2)
                System.out.println("Winter");
            else if (m>=3&&m<=5)
                System.out.println("Spring");
            else if (m>=6&&m<=8)
                System.out.println("Summer");
            else
                System.out.println("Autumn");
        }
    }
}