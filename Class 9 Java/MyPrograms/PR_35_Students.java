import java.util.*;
class PR_35_Students {
    public static void main(String[] args) {
        int n = 0;
        double percentage = 0.0;

        Scanner sc = new Scanner(System.in);
        for (int i = 0;i<2;i++){
            n = 0;
            System.out.println("SECTION - "+(char)(65+i));
            for (int j = 0;j<5;j++){
                System.out.print("Enter percentage : ");
                percentage = sc.nextDouble();
                if (percentage>=95)
                    n++;
            }
            System.out.println("Number of students getting 95% and above in section : "+n);
        }
    }    
}
