import java.util.*;
class PR_28_Pattern {
    public static void main(String[] args) {
        // 1
        // 3 4
        // 4 5 6

        int k = 1;
        for (int i = 0;i<3;i++){
            for (int j = 0;j<=i;j++)
                System.out.print((k++)+" ");
            
            if (i==0)
                k++;
            else
                k--;

            System.out.println();
        }

    }
}
