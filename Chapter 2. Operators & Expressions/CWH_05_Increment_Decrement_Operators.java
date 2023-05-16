public class CWH_05_Increment_Decrement_Operators 
{
    public static void main(String[] args) 
    {
        // Increment Operator
        int i = 23;
        int u = ++i; // first increment "i" by 1 then assign to u.(24)
        u = i++; // first assigned "i" to "u" then increment "i" by 1.(24)
        System.out.println("Value of u = "+u); 
        
        // Decrement Operator
        int k = 14;
        int o = k--; // first assign "k" to "o" then decrement "k" by 1.(14)
        o = --k; // first decrement "k" by 1 then assign to "o". (12)
        System.out.println("Value of o = "+o);
        
        // Increment in char
        char id = 'A';
        char od = ++id;
        id++;
        id++;
        id++;
        System.out.println("Value of od = "+od);// od is now 'B'
        // Decrement in char
        id--;
        System.out.println("Value of id = "+id); // id is now 'D' 
    }    
}
