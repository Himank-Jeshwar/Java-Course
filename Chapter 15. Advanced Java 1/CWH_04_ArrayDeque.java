

import java.util.ArrayDeque;

public class CWH_04_ArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad = new ArrayDeque<>();
        ad.add(6);
        ad.add(88);
        ad.add(90);
        ad.addFirst(9);
        ad.addLast(19);
        ad.addLast(102);
        ad.removeLast();
        System.out.println(ad);
        
    }
}
