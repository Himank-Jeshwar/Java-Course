public class CWH_01_Strings
{
    public static void main(String[] args) 
    {
                                
        String name = "Himank"; //or ,String name = new String("Himank");
        int a = 10;
        float u = 88.5f;
        float total = a+u;
        System.out.println(name);
        // System.out.printf("%f + %d = %f",u,a,total);
        System.out.format("%.1f + %d = %.1f",u,a,total);
    
}
}