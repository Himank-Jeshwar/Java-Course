class Animal{
    String tongueColor = "red";
    int legs = 4,eyes = 2,ears = 2;
    public void eat(){
        System.out.println("Eating...");
    }
    public void run(){
        System.out.println("Running...");
    }
    public void sleep(){
        System.out.println("Sleeping...");
    }
}
class Dog extends Animal{
    String skincolor = "fair";
    public void bark(){
        System.out.println("Bhow! Bhow!");
    }
}
public class Quick_Quiz {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.run();
        d.sleep();
        d.bark();
        System.out.println("Dog has "+d.eyes+ " eyes");
        System.out.println("Dog has "+d.ears+ " ears");
        System.out.println("Dog has "+d.legs+ " legs");
        System.out.println("Dog has "+d.tongueColor+ " color tongue");
    }
}
