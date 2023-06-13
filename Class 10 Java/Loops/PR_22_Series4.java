import java.util.*;
class PR_22_Series4 {
    public static void main(String[] args) {
        // declaration 
        int n,d;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first term : ");
        n = sc.nextInt();
        System.out.print("Enter common difference : ");
        d = sc.nextInt();

        for (int i = 0;i<10;i++){
            System.out.print(n+i*d);
            if (i<9)
                System.out.print(", ");
        }
    }
}
