import java.util.*;
class PR_08_DecimalToBinarySecondMethod {
    public static void main(String[] args) {
        int num,i;
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter decimal : ");        
        num = sc.nextInt();

        for (i = 7;i>=0;i--){
            if (num>Math.pow(2,i))
                i--;
        }

        for (int j = i;j>=0;j--){
            if ()
        }
    }
}
