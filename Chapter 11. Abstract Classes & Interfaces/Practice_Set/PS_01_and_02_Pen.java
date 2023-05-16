// Problem 1
abstract class Pen{
    abstract void write();
    abstract void refill();
}

// Problem 2
class FountainPen extends Pen{
    void write(){
        System.out.println("Writing with Fountain Pen...");
    }
    void refill(){
        System.out.println("Refilling the fountain pen....");
    }
    void changeNib(){
        System.out.println("Changing nib...");
    }
}
public class PS_01_and_02_Pen {
    public static void main(String[] args) {
        FountainPen fp = new FountainPen();
        fp.write();
        fp.refill();
        fp.changeNib();
    }
}