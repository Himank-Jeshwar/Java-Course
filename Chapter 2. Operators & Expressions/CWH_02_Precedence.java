/* ORDER OF EVALUATION OF ARITHMETIC OPERATORS
1. Brackets or Parenthesis ()
2. Exponents 
3. Multiplication, Division and Modulus have same precedence
4. Addition and Substraction have same precendence
*/ 

/* ORDER OF EVALUATION OF LOGICAL OPERATORS
1. ! --> not
2. && --> and
3. || --> or
*/

public class CWH_02_Precedence
{
    public static void main(String[] args) 
    {
        int a = 7*9+9/2;
        int b = 45;
        int c = 56;
        boolean bg = !(b>c && b==45 || c==56 && b<c);
        System.out.println("Answer of a = "+a); // Answer of a = 67
        System.out.println("Result = "+bg); // returns false
    }
}