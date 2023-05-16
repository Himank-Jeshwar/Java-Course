
import java.util.*;
public class CWH_02_ArrayList {
    public static void main(String[] args) {
        ArrayList<String>colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");
        colors.add("Violet");
        colors.add("Purple");
        colors.add("Green");

        // colors.add(0,"Black");
        colors.set(0,"Maroon");
        colors.remove(2);
        System.out.println(colors.contains("Black"));
        
        // System.out.println(colors.get(3));
        // System.out.println(colors);
        
        // reversing an ArrayList
        for (int i = 0;i<(int)(colors.size()/2);i++){
            String temp = colors.get(i);
            colors.set(i,colors.get(colors.size()-i-1));
            colors.set(colors.size()-i-1,temp);
        }
        ArrayList<Integer> num = new ArrayList<>();
        num.add(7);
        num.add(122);
        num.add(22);
        num.add(45);
        num.add(10);
        int sum = 0;
        for (int j = 0;j<num.size();j++){
            sum+=num.get(j);
        }
        
        System.out.println(sum);
    }
}
