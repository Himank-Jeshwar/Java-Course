class Base1{
    public Base1(){
        System.out.println("I am a base class constructor.");
    }
    public Base1(String n){
        System.out.println("Name - "+n);
    }
}
class Derived1 extends Base1{
    public Derived1(){
        super("Himank Jeshwar");
        System.out.println("I am a derived class constructor.");
    }
    public Derived1(int age){
        super("Himank Jeshwar");
        System.out.println("Age - "+age);
    }
}

class ChildOfDerived1 extends Derived1{
    public ChildOfDerived1(){
        System.out.println("I am a Child Of Derived class constructor.");
    }
    public ChildOfDerived1(int x,int y){
        super(y);
        System.out.println("Value of x = "+x);
    }
}
public class CWH_02_Constructors_In_Inheritance {
    public static void main(String[] args) {
        ChildOfDerived1 cd = new ChildOfDerived1(2,3);
      
      
    }    
}