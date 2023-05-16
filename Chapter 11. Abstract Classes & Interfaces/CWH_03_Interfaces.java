interface Bicycle {
    int a = 8;
    void applyBrake(int decrement);
    void speedUp(int increment);
}
interface Cycle{
    void horn();
}

class AvonCycle implements Bicycle,Cycle{
    int speed = 7;
    public void applyBrake(int decrement){
        speed-=decrement;
    }
    public void speedUp(int increment){
        speed+=increment;
    }
    public void horn(){
        System.out.println("Poo Poo !!");
    }
   
}

public class CWH_03_Interfaces {
    public static void main(String[] args) {
        AvonCycle ac = new AvonCycle();
        ac.applyBrake(2);
        System.out.println(ac.speed);
        ac.horn();
        // Can create properties in Interfaces
        System.out.println(ac.a);

        /* Cannot change properties in Interfaces as they are final
        ac.a = 12; (Not allowed)
        */
    }
}
