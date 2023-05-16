public class Quick_Quiz_2 
{
    public static void main(String[] args) 
    {
        int x = 9;
        int y = x++;
        System.out.println("Value of y = "+y); // y = 9
        y = ++x;
        System.out.println("Value of y = "+y); // y = 11
        y = x--;
        y = --x;
        y = x--;
        System.out.println("Value of y = "+y); // y = 9
        System.out.println("Value of x = "+x); // x = 8

    }    
}
