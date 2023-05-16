public class CWH_03_MethodOverloading {
    static void greet(){
        System.out.println("Good Morning Sir.");
    }
    static void greet(String name){
        System.out.println("Good Morning "+name);
    }
    static void greet(String name,double bill){
        System.out.print("Good Morning "+name+"\n\tRecharge for "+bill+" has been successfully done.\n\tHave a nice day!");
        
    }
    public static void main(String[] args) {
        greet();
        greet("Rahul");
        greet("Rohan",980.5);
    }
}
