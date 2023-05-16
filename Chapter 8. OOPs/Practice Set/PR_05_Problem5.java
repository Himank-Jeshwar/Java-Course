class TommyVecetti{
    void hit(){
        System.out.println("hitting...");
    }
    void run(){
        System.out.println("running...");
    }
    void fire(){
        System.out.println("firing...");
    }
}
public class PR_05_Problem5 {
    public static void main(String[] args) {
        TommyVecetti tv = new TommyVecetti();
        tv.fire();
        tv.run();
        tv.hit();
    }
}
