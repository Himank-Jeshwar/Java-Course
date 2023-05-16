class Base3{
    public int harry(){ return 4 ;}
    public void method2(){System.out.println("I am method 2 of class Base3");}
}

class Derived3 extends Base3{
    public void method3(){System.out.println("I am method 3 of class Derived3");}

    @Override
    public void method2(){System.out.println("I am method 2 of class Derived3");}
}
public class CWH_04_Method_Overriding {
    public static void main(String[] args) {
        Base3 b = new Base3();
        Derived3 d = new Derived3();
        b.method2();
        d.method2();
        
    }
}
