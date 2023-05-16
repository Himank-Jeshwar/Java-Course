class Cellphone{
    void vibrate(){
        System.out.println("vibrating...");
    }
    void ring(){
        System.out.println("ringing...");
    }
    void call(){
        System.out.println("calling...");
    }
}
public class PR_02_Problem2 {
    public static void main(String[] args) {
        Cellphone cp = new Cellphone();
        cp.call();
        cp.vibrate();
        cp.ring();
    }
}
