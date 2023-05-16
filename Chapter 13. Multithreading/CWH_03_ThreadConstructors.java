class MyThread5 extends Thread{
    public MyThread5(String name){
        super(name);
    }

    public void run(){
        for (int i = 0;i<=100;i++){
            System.out.println("Downloading data....");
        }
    }
   
}

class MyThread6 implements Runnable{
    public void run(){
        for (int i = 0;i<=100;i++){
            System.out.println("Opening chrome...");
        }
    }
}
public class CWH_03_ThreadConstructors {
    public static void main(String[] args) {
        // MyThread5 t5 = new MyThread5();
        Runnable t6 = new MyThread6();
        MyThread5 t5 = new MyThread5("Thread 5");
        Thread th2 = new Thread(t6);
        // t5.start();
        // th2.start();
        System.out.println(t5.getId());
        System.out.println(t5.getName());
        System.out.println(th2.getName());
    }
}
