import java.util.Scanner;
public class CWH_04_nested_try_catch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int [] marks = {7,56,45,12};
        try{
            System.out.println("Enter the value of index = ");
            int ind = sc.nextInt();
            sc.close();
            System.out.println("Welcome!");
            try{
                System.out.println(marks[ind]);
            }
            catch(ArrayIndexOutOfBoundsException indexException){
                System.out.println("Sorry this index does not exist.");
                System.out.println("Exception in level 2");
            }
            System.out.println("This outer try is working");
        }
        catch(Exception e){
            System.out.println("Exception in level 1");
        }
    }
}
