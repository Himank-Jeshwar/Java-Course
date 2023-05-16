interface Parent1{
    void meth1();
    void meth2();
}

// Will throw error
// interface Child implements Parent {
//     void meth3();
//     void meth4();
// }


// Will throw error
// class Child extends Parent{
//    void meth3();
//    void meth4();
// }

interface Child1 extends Parent1{
    void meth3();
    void meth4();
}

class MySampleClass implements Child1{
    public void meth1(){
        System.out.println("Iam method 1");
    }
    public void meth2(){
        System.out.println("Iam method 2");
    }
    public void meth3(){
        System.out.println("Iam method 3");
    }
    public void meth4(){
        System.out.println("Iam method 4");
    }
}
/* Remember :-
1. A class cannot "extend" an interface.It can "implement" interface.
2. An interface cannot implement another interface,only classes can do that.
*/
public class CWH_05_InheritanceInInterfaces {
    public static void main(String[] args) {
        MySampleClass msc = new MySampleClass();
        msc.meth1();
        msc.meth2();
        msc.meth3();
        msc.meth4();
    }    
}
