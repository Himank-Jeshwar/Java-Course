import java.util.Scanner;
class PR_05_UniqueNumber {
    public static void main(String[] args) {
        int num, i = 0,c,copy;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        num = sc.nextInt();
        
        while (i<10){
            c = 0;
            copy = num;
            while (copy>0){
                if ((copy%10)==i)
                    c++;
                copy/=10;
            }
            if (c>1){
                System.out.println("It is not an unique number.");
                break;
            }
            i++;
        }
        if (i==10)
            System.out.println("It is an unique number.");
    }
}
