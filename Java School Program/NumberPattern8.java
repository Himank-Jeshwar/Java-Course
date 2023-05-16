import java.util.Scanner;
class NumberPattern8 {
    int n;
    int reverseNumber(int num){
        int rev = 0;
        while (num>0){
            rev= rev*10+(num%10);
            num/=10;
        }
        return rev;
    }
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of lines : ");
        n = sc.nextInt();
        sc.close();
    }

    void display(){
        int x = 0;
        for (int i = 0;i<n;i++){
            x = (int)Math.pow(11,i);
            while (x>0){
                System.out.print((reverseNumber(x)%10)+" ");
                x/=10;
            }
            System.out.println();
        }
   }
   public static void main(String[] args) {
    NumberPattern8 nPattern8 = new NumberPattern8();
    nPattern8.input();
    nPattern8.display();
   }
}
