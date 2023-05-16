public class CWH_01_Operators 
{
    public static void main(String[] args) 
    {   
        // (1) Arithmetic Operators
        int a = 12;
        int b = 8;
        int total = a+b;
        int rem = a % b; // '%' - Modulus or Modulo Operator 
        System.out.println("Remainder = "+rem);
        System.out.println("Total = "+total);
        
        // (2) Assignment Operators
        a+=5; // or , a = a + 5;
        b-=6; // or , b = b - 6;
        a*=5; // or,  a = a*5;
        System.out.println("Value of a = "+a);
        System.out.println("Value of b = "+b);

        // (3) Comparison Operators 
        boolean com1 = a<b;
        boolean eq = a==b;
        boolean com2 = a>b;
        System.out.println(com1); // returns false
        System.out.println(com2); // returns true
        System.out.println(eq); // returns false

        // (4) Logical Operators
        System.out.println(a>b && b==8); // returns true
        System.out.println(a<b || b==9); // returns false
        System.out.println(!(a<8)); // returns true
    }
}