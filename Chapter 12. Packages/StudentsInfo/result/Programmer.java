package StudentsInfo.result;
import StudentsInfo.details.Employee1;
class Programmer1 extends Employee1{
    void meth1(){
        System.out.println(age);
    }
}
// Protected fields of other packages can only be called by function.
public class Programmer {
    public static void main(String[] args) {
        Programmer1 p1 = new Programmer1();
        System.out.println(p1.salary);
        p1.meth1();
        // System.out.println(p1.);
    }
}
