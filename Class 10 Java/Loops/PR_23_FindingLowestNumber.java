import java.util.*;
class PR_23_FindingLowestNumber {
    public static void main(String[] args) {
        int low = 0,n;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter 10 numbers : ");
        n = sc.nextInt();
        low = n;
        for (int i = 0;i<9;i++){
            n = sc.nextInt();
            if (n<low)
                low = n;
        } 
        System.out.println("Lowest number : "+low);
    }
}
