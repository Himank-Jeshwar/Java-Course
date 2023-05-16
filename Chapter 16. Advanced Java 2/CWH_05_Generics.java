import java.util.ArrayList;
class MyGeneric<ClassName>{
    int val = 344;
    private ClassName t1;
    public MyGeneric(int val,ClassName t1){
        this.val = val;
        this.t1 = t1;
    }
    public ClassName getT1() {
        return t1;
    }
    public void setT1(ClassName t1) {
        this.t1 = t1;
    }
}
public class CWH_05_Generics {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        MyGeneric<String>g1 = new MyGeneric<>(9,"Hello");
        // ArrayList<int> al = new ArrayList<>(); -> Type parameter can't be a primitive data type
        al.add(8);
        // al.add("Himank");
        // al.add(true);
        // al.add(new Scanner(System.in));
        int a = al.get(0);
        System.out.println(al);
        System.out.println(a);
        String str = g1.getT1();
        System.out.println(str);
    }
}
