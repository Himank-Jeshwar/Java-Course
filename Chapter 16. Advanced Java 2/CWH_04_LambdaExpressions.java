@FunctionalInterface
interface DemoAno{
    void add(int a,int b);
}

// class Demo implements DemoAno{
//     @Override
//     public void meth1(){
//         System.out.println("Good Morning");
//     }
// }
// class AnonyDemo implements DemoAno{
//     void display(){
//         System.out.println("Hello");
//     }
//     @Override
//     public void meth1(){
//         System.out.println("Method 1");
//     }

//     @Override
//     public void meth2(){
//         System.out.println("Method 2");
//     }
// }
public class CWH_04_LambdaExpressions {
    public static void main(String[] args) {
        
        // DemoAno da = new DemoAno() {
        //     @Override
        //     public void meth1(){
        //         System.out.println("Method 1");
        //     }

        //     // @Override
        //     // public void meth2(){
        //     //     System.out.println("Method 2");
        //     // }
        // };
        // da.meth1();

        /*Demo d = new Demo();
        d.meth1();*/

        // Lambda Expressions
        // Works for only Functional Interface
        DemoAno da = (a,b)->{
            System.out.println("Answer :- "+(a+b));
        };
        da.add(9,8);
    }    
}
