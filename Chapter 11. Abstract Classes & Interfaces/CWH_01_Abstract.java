abstract class Parent{
    public Parent(){
        System.out.println("I am a Parent class constructor");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
}
class Derived extends Parent{
    @Override
    public void greet(){
        System.out.println("Good morning");
    }   

}
abstract class Derived2 extends Parent{
    public void th(){
        System.out.println("Have a nice day!");
    }
    
}
public class CWH_01_Abstract {
   
    public static void main(String[] args) {
        /* Cannot create object for an abstract class
        Parent p = new Parent();
        Derived2 d2 = new Derived2();
        */

        Parent d = new Derived(); // is allowed
        d.sayHello();
        d.greet();

        // Abstract class is the blueprint for various concrete classes.
        
    }    
}