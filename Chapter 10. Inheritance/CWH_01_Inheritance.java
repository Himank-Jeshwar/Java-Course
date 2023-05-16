class Base{
    int x;
    public Base(){
        System.out.println("I am a constructor.");
    }
    public int getX(){
        return x;
    }
    public void setX(int n){
        this.x = n;
    }
}

class Derived extends Base{
    int y;
    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y = y;
    }
}

public class CWH_01_Inheritance{
    public static void main(String[] args) {
        // Object instantiation of base class
        Base b = new Base();

        /* NOTE - METHODS AND DATA MEMBERS OF THE DERIVED CLASS 
                  IS NEVER AVAILABLE IN BASE CLASS */
        /* b.setY(8);
         System.out.println(b.getY());*/ 
         
        b.setX(8);
        System.out.println(b.getX());
        // object instantiation of derived class.
        Derived d = new Derived();
        d.setX(83);
        System.out.println(d.getX());
    }
}