import java.util.Scanner;
public class CWH_02_try_catch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value for b = ");
        int a = 6000;
        int b = sc.nextInt();
        int c = 0;
        sc.close();
        try{
            c = a/b;
            System.out.println("The result is "+c);
        }
        catch(Exception e){
            System.out.println("B can't be 0 !");
        }
        
        System.out.println("****Program ends****");
    }
}
