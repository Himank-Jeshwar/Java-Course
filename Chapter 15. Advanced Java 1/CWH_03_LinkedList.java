
import java.util.LinkedList;
public class CWH_03_LinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> num = new LinkedList<>();
        num.add(7);
        num.add(122);
        num.add(22);
        num.add(45);
        num.add(10);
        num.addFirst(9);
        System.out.println(num);
    }
}
