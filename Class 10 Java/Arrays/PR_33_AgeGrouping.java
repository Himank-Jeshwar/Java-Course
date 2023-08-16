import java.util.*;
class PR_33_AgeGrouping {
    public static void main(String[] args) {
        // declaration
        int age[] = new int [20];
        int c1 = 0 ,c2 = 0,c3 = 0;

        Scanner sc = new Scanner (System.in);
        System.out.println("Enter age of 20 people : ");
        for (int i = 0;i<age.length;i++){
            age[i] = sc.nextInt();
        }

        for (int i = 0;i<age.length;i++){
            if (age[i]>=26&&age[i]<=35)
                c1++;
            else if (age[i]>=36&&age[i]<=45)
                c2++;
            else if (age[i]>=46&&age[i]<=55)
                c3++;
        }
        System.out.println("People belonging to age group 26-35 : "+c1);
        System.out.println("People belonging to age group 36-45 : "+c2);
        System.out.println("People belonging to age group 46-55 : "+c3);
    }
}
