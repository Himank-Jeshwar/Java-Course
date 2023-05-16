import java.util.*;
public class CWH_01_Collections {
    public static void main(String[] args) {
        // ArrayList - modified array
        ArrayList <Integer> myArr1 = new ArrayList<>();
        ArrayList <Integer> myArr2 = new ArrayList<>(5);
        
        // myArr1 elements
        myArr1.add(0,5);
        myArr1.add(1,3);
        myArr1.add(1,8);
        myArr1.add(99);
        

        // myArr2 elements
        myArr2.add(18);
        myArr2.add(90);
        myArr2.add(120);
        myArr2.addAll(0,myArr1);
        myArr2.add(80);
        myArr2.add(90);
        // myArr2.clear();
        myArr2.remove(0); // removes the element at index 0
        myArr2.set(4,89);
        System.out.println(myArr2.contains(90));
        System.out.println(myArr2.lastIndexOf(90));
        System.out.print("myArr2 : ");
        for(int i = 0;i<myArr2.size();i++){
            System.out.print(myArr2.get(i)+" ");
        }
    }    
}