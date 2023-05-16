class MyThread3 implements Runnable{
    public void run(){
        int i = 0;
        while(i<=100){
            System.out.println("I am a thread not a threat.");
            i++;
        }
        }
}
class MyThread4 implements Runnable{
    public void run(){
        int i = 0;
        while (i<=100) {
            System.out.println("I am enjoying....");
            i++; 
        }
    }
}
public class CWH_02_RunnableInterface {
    public static void main(String[] args) {
        MyThread3 bullet1 = new MyThread3();
        MyThread4 bullet2 = new MyThread4();
        Thread gun1 = new Thread(bullet1);
        Thread gun2 = new Thread(bullet2);
        gun1.start();
        gun2.start();
    }
}
