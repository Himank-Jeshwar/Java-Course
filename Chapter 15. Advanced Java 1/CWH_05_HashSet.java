import java.util.HashSet;

public class CWH_05_HashSet {
    public static void main(String[] args) {
        HashSet<Integer> myHashSet = new HashSet<>(6);
        myHashSet.add(92);
        myHashSet.add(88);
        myHashSet.add(11);
        myHashSet.add(11);
        myHashSet.add(91);
        myHashSet.add(8);
        myHashSet.add(810);
        System.out.println(myHashSet);
    }
}
