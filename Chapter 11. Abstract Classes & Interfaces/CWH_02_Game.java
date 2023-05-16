abstract class Game{
    double speed;
    abstract void run();
    abstract void jump();
    abstract double speedofPlayer(double d,double t);
    abstract void attack();
}
class GTA5 extends Game{
    void run(){
        System.out.println("Michael is running ...");
    }
    void jump(){
        System.out.println("Michael is attacking ...");    
    }
    double speedofPlayer(double d , double t){
        speed = d/t;
        return speed;
    }
    void attack(){
        System.out.println("Michael is firing...\nMichael is beating Franklin...");
    }
}

class FreeFire extends Game{
    double speedofPlayer(double dist,double time){
        speed = dist/time;
        return speed;
    }
    void run(){
        System.out.println("DJ Alok is running...");
    }
    void walk(){
        System.out.println("DJ Alok is walking...");
    }
    void jump(){
        System.out.println("DJ Alok is jumping the building...");
    }
    void attack(){
        System.out.println("DJ Alok is firing with M249...");
    }
}

public class CWH_02_Game {
    public static void main(String[] args) {
        GTA5 g = new GTA5();
        FreeFire ff = new FreeFire();

        // Game gam = new Game(); (not allowed)
        
        // Game gam = new GTA5(); (allowed) 
        // Game game = new FreeFire(); (allowed)
        g.run();
        ff.attack();
    }
}
