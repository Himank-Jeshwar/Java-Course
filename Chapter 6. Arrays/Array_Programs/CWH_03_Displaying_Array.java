package Array_Programs;

public class CWH_03_Displaying_Array {
    public static void main(String[] args) {
        String [] fruits = {"Apple","Banana","Mango","Grapes","Pineapple"};
        // Using for loop
        for (int o = 0;o<fruits.length;o++){
            System.out.println(fruits[o]);
        }
        // Using while loop
        int i = 0;
        while (i<fruits.length){
            System.out.println(fruits[i]);
            i++;
        }
        // Using do while loop
        int k = 0;
        do {
            System.out.println(fruits[k]);
            k++;
        }while (k<fruits.length);
    }
    }