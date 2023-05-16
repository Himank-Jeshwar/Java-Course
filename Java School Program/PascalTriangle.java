import java.util.Scanner;
class PascalTriangle{
    int n;
    void input(){
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a number : ");
        n = inp.nextInt();
    }

    void display(){
        int num;
        String msg;
        for (int i = 0;i<n;i++){
            num = (int)(Math.pow(11, i));
            msg = String.valueOf(num);
            for (int j = 0;j<msg.length();j++){
                System.out.print(msg.charAt(j)+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        PascalTriangle pattern = new PascalTriangle();
        pattern.input();
        pattern.display();
    }
}