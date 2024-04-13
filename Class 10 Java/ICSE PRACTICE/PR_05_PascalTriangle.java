import java.util.*;
class PR_05_PascalTriangle {
    public static void main(String[] args) {
        int n = 0;
        for (int i = 0;i<5;i++){
            for (int j = 4;j>i;j--)
                System.out.print(" ");
            
            n = (int)(Math.pow(11,i));
            while(n>0){
                System.out.print(n%10+" ");
                n/=10;
            }
            System.out.println();
        }
    }
}
