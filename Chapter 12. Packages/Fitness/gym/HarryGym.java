package Fitness.gym;
import StudentsInfo.result.C1;
class Using extends C1{
    public void display(){
        System.out.println(x); // public
        System.out.println(y); // protected
        // System.out.println(z); // private
        // System.out.println(u); // default
    }
}
public class HarryGym {
    public static void main(String[] args) {
        C1 c = new C1();
        Using use = new Using();
        System.out.println(c.x);
        use.display();
        // Cannot access
        // System.out.println(c.y);
        // System.out.println(c.z);
        // System.out.println(c.u);
    }
}
