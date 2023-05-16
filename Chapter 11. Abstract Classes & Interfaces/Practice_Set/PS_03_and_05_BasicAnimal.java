interface BasicAnimal{
    void eat();
    void sleep();
}

class Monkey {
    void jump(){
        System.out.println("Jumping...");
    }
    void bite(){
        System.out.println("Biting...");
    }
}
class Human extends Monkey implements BasicAnimal{
    @Override
    public void eat(){
        System.out.println("Eating...");
    }

    @Override
    public void sleep(){
        System.out.println("Sleeping...");
    }
    void readBook(){
        System.out.println("Reading book...");
    }
    void sing(){
        System.out.println("Singing...");
    }
}
public class PS_03_and_05_BasicAnimal {
    public static void main(String[] args) {
        // Problem 3
        Human h = new Human();
        h.bite();
        h.eat();
        h.readBook();
        h.sing();
        h.sleep();
        h.jump();

        // Problem 5
        Monkey m = new Human();
        m.bite();
        m.jump();

        BasicAnimal ba = new Human();
        ba.sleep();
        ba.eat();
    }
}
