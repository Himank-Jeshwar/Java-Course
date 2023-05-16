class Base2{
    int a;
    public Base2(int a){
        this.a = a;
    }
    public int getA(){
        return a;
    }
}

class Derived2 extends Base2{
    public Derived2(int c){
        super(c);
        System.out.println("I am Derived2 class constructor.");
    }
}
public class CWH_03_this_and_super {
    public static void main(String[] args) {
        Base2 b = new Base2(78);
        Derived2 d = new Derived2(5);
        System.out.println(d.getA());
}
}