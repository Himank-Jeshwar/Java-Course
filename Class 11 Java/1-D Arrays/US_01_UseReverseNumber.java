import java.util.*;
class US_01_UseReverseNumber {
    public static void main(String[] args) {
        int s;
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter size of the array : ");
        s = sc.nextInt();

        PR_01_ReverseNumber ob = new PR_01_ReverseNumber(s);
        ob.fillarray();
        System.out.print("Original array : ");
        ob.display();
        ob.findreverse(ob);
        System.out.print("Reverse array : ");
        ob.display();
    }
}
