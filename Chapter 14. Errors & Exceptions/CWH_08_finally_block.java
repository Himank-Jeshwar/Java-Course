public class CWH_08_finally_block {
    public static void divide(){
        try{
            int a = 15;
            int b = 5;
            int c = a/b;
            System.out.println(c);
            return;
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }
        finally{
            System.out.println("*****End of program*****");
        }
    }
    public static void main(String[] args) {
        divide();
        
    }
    }

