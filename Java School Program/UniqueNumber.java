import java.util.Scanner;
class UniqueNumber{
    public static void main(String[]args){
        // declaration
        int n,digit = 0,c,i = 0;
        int num;
        // input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        num = sc.nextInt();
        sc.close();

        // checking unique number
        //   i = 0  c = 0
        while (i<10){
            c = 0;
            n = num;
            while(n>0){
                digit = n%10;
                if (digit==i)
                    c++;
                n/=10;
            }
            if (c>1){
                System.out.print(num+" is not a unique number.");
                break;
            }
            i++;
        }
        if (i==10)
            System.out.print(num+" is a unique number.");
        }
}