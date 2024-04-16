import java.util.*;
class PR_11_RotateString{
    String anticlockwise(String s){
        s = s.substring(1)+s.charAt(0); // rotation 1
        s = s.substring(1)+s.charAt(0); // rotation 2
        return s;
    }

    String clockwise(String s){
        s = s.charAt(s.length()-1)+s.substring(0,s.length()-1); // rotation 1
        s = s.charAt(s.length()-1)+s.substring(0,s.length()-1); // rotation 2
        return s;
    }
    public static void main(String[] args) {
        String s1,s2;
        Scanner sc = new Scanner(System.in);
        PR_11_RotateString ob = new PR_11_RotateString();

        System.out.println("Enter two strings : ");
        s1 = sc.next();
        s2 = sc.next();

        if (ob.clockwise(s1).equals(s2))
            System.out.println("Yes \nType of rotation : clockwise");
        else 
            if (ob.anticlockwise(s1).equals(s2))
                System.out.println("Yes \nType of rotation : anticlockwise");
            else
                System.out.println("No");
    }   
}