class MyThread7 extends Thread{
    public MyThread7(String name){
        super(name);
    }

    public void run(){
        for (int i = 0;true;i++){
            System.out.println("Downloading data....");
        }
    }
   
}

class MyThread8 implements Runnable{
    public void run(){
        for (int i = 0;true;i++){
            System.out.println("Opening chrome...");
        }
    }
}
public class CWH_04_ThreadPriorities {
    public static void main(String[] args) {
        MyThread7 t7 = new MyThread7("Thread 7");
        MyThread8 t8 = new MyThread8();
        Thread th3 = new Thread(t8,"Thread 8");
        t7.start();
        th3.start();
        th3.setPriority(Thread.MIN_PRIORITY);
    }
}
