// 100
class MyThread9 extends Thread{
    public MyThread9(String name){
        super(name);
    }

    public void run(){
        for (int i = 1;true;i++){
            System.out.println("Downloading data....");
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
   
}

class MyThread10 implements Runnable{
    public void run(){
        for (int i = 1;true;i++){
            System.out.println("Opening chrome...");
        }
    }
}
public class CWH_05_ThreadMethods {
    public static void main(String[] args) {
        MyThread9 t9 = new MyThread9("Thread 9");
        MyThread10 t10 = new MyThread10();
        Thread th4 = new Thread(t10,"Thread 10");
        t9.start();
        try{
            t9.join();
        }
        catch(Exception e){
            System.out.println(e);
        }
        th4.start();
        
    }
}
