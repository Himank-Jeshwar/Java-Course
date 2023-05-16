import java.util.Scanner;
class MaxNumber {
    int num[];
    void input (){
        num = new int [10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0;i<num.length;i++){
            System.out.print("Enter number "+(i+1)+" : ");
            num[i]=sc.nextInt();
        }
        sc.close();
    }
    int greatest(){
        int max = 0;
        for (int j = 0;j<num.length;j++){
            if (num[j]>max)
                max = num[j];
        }
        return max;
    }
    public static void main(String[] args) {
        MaxNumber maxNumber = new MaxNumber();
        maxNumber.input();
        System.out.print("Greatest number : "+maxNumber.greatest());        
    }
}
