class Greet1 extends Thread{
    public Greet1(String name){
        super(name);    
    }
    @Override
    public void run(){
        // while (false){
        //     System.out.println("good morning");
        // }
    }
}
class Greet2 extends Thread{
    public Greet2(String name){
        super(name);
    }
    @Override
    public void run(){
        // while(true){
        //     System.out.println("welcome");
            // try{
            //     Thread.sleep(200);
            // }
            // catch(InterruptedException e){
            //     System.out.println(e);
            // }

        // }
    }
}
public class PS_01_GreetingThreads {
    public static void main(String[] args) {
        Greet1 g1 = new Greet1("Good morning thread");
        Greet2 g2 = new Greet2("welcome thread");
        g1.start();
        g2.start();
        g1.setPriority(Thread.MIN_PRIORITY);
        System.out.println(g1.getPriority()+"\n"+g2.getPriority());
        System.out.println(g1.getState());
        System.out.println(Thread.currentThread().getState());
        System.out.println(g2.getState());
        System.out.println(Thread.currentThread().getState());
    }    
}