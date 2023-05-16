import java.util.Scanner;
class CheckPerfectSquare {
    int num[];
    public CheckPerfectSquare(){
        num = new int[10];
    }
    void input(){
        Scanner sc = new Scanner(System.in);
        for (int i = 0;i<num.length;i++){
            System.out.print("Enter number "+(i+1)+" : ");
            num[i]=sc.nextInt();
        }
        sc.close();
    }    
    void display(){
        int sqroot = 0;
        System.out.println("The Perfect Squares are : ");
        for (int j = 0;j<num.length;j++){
            sqroot = (int)(Math.sqrt(num[j]));
            if (sqroot*sqroot==num[j])
                System.out.println(num[j]);
        }
    }
    public static void main(String[] args) {
        CheckPerfectSquare perfectSquare = new CheckPerfectSquare();
        perfectSquare.input();
        perfectSquare.display();
    }
}
