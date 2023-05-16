interface MyInterface{
    int add(int a,int b);
    int multiply(int a,int b);
}
public class PS_04_InstanceOfInterface {
    public static void main(String[] args) {
        MyInterface mInterface = new MyInterface() {
            @Override
            public int add(int a,int b){
                return a+b;
            }

            @Override
            public int multiply(int a,int b){
                return a*b;
            }
        };
        System.out.println(mInterface.add(9, 8));
        System.out.println(mInterface.multiply(9, 8));

    }
}
