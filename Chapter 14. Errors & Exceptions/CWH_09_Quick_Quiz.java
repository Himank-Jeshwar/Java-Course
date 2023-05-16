public class CWH_09_Quick_Quiz {
    public static void printNumb()throws InterruptedException{        
        for (int i=21,j=45,c=1;/*condition */;j--,c++){
        try{
            System.out.println(i/j);
            Thread.sleep(1000);
        }
        catch(ArithmeticException e){
            System.out.println(e);
            break;
        }
        finally{
            System.out.println("Completed Operation "+c);
            Thread.sleep(500);
        }
        }
    }

    public static void main(String[] args) {
        try{
            printNumb();
        }
        catch(InterruptedException i){
            System.out.println(i);
        }
    }
}
