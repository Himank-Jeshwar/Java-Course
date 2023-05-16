public class CWH_02_Logical_Operators {
    public static void main(String[] args) {
        //(1) && (And) Operator
        System.out.print("AND (&&) OPERATOR ANSWERS :-\n");
        int a = 121;
        int b = 166;
        int c = 2;
        if (a>b && a>c) {
            System.out.println("A is greater !\n");
        }
        else {
            System.out.println("A is not greater !\n");
        }

        //(2) || (OR) Operator
        System.out.print("OR (||) OPERATOR ANSWERS :-\n");
        int a1 = 121;
        int b1 = 166;
        int c1 = 20;
        if (a1>b1 || a1>c1) {
            System.out.println("Good !\n");
        }
        else {
            System.out.println("Bad !\n");
        }
 
        // (3) ! (NOT) Operator
        System.out.print("NOT (!) OPERATOR ANSWERS :-\n");
        int a2 = 121;
        int b2 = 166;
        int c2 = 20;
        if (!((a2<b2 || a2>c2) && (a2>b2 || a2>c2))) {
            System.out.print("Good !\n");
        }
        else {
            System.out.print("Bad !\n");
        }  
    }    
}