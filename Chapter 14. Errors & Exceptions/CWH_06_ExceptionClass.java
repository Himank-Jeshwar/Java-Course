import java.util.Scanner;

class MyException extends Exception{
    @Override
    public String toString(){
        return "I am toString().";
    }

    @Override
    public String getMessage() {
        return "I am getMessage().";
    }
}
public class CWH_06_ExceptionClass {
    public static void main(String[] args) {
        int a ;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a = ");
        a = sc.nextInt();
        sc.close();
        if (a<99){
            try{
                throw new MyException();
                // throw new ArithmeticException("This is an exception.");
            }
            catch(Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                e.printStackTrace();
            }
            System.out.println("Finished");
        }
    }
}
