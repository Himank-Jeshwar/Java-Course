import java.util.*;
class PR_20_Tribonacci_and_SunnyNumbers {
    static void generateTribonacci(){
        int a = 1 , b = 1, c = 2 , d = 0;
        for (int i = 1;i<=20;i++){
            System.out.print(a+" ");
            d = a+b+c;
            a=b;
            b=c;
            c=d;
        } 
    }

    // imp -> n%1 == 0 then n is an integer
    static void printSunnyNum(int n){
        for (int i = 1;i<=n;i++){
            if (Math.sqrt(i+1)%1==0){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        int ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("1 - Generate Tribonacci\n2 - Print Sunny Numbers");
        ch = sc.nextInt();

        switch(ch){
            case 1:
                generateTribonacci();
                break;
            case 2:
                int n;
                System.out.print("Enter value for n : ");
                n = sc.nextInt();
                printSunnyNum(n);
                break;
            default:
                System.out.println("Invalid Choice!");
        }
        sc.close();
    }
}
