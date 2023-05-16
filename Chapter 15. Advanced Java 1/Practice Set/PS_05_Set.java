import java.util.HashSet;
class PS_05_Set{
    public static void main(String []args){
        HashSet <Integer> set = new HashSet<>();
        set.add(18);
        set.add(18);
        set.add(10);
        set.add(11);
        set.add(88);
        set.add(10);
        System.out.println(set);
    }
}