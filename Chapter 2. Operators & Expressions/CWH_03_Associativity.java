// If any operator have same precendence then associativity is checked.
/*
    ASSOCIATIVITY
    1. *,/ --> Left to Right
    2. +,- --> Left to Right
    3. ++,= --> Right to Left
*/    
public class CWH_03_Associativity 
{
    public static void main(String[] args) 
    {
        int a = 7;
        int b = 4*8+6/2-15;
        a += b = 78; // Right to left associativity
        System.out.println("a = "+a);  
        System.out.println("b = "+b);  
    }    
}
