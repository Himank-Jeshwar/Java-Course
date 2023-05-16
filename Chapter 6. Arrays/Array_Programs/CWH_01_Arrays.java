package Array_Programs;
public class CWH_01_Arrays {
    public static void main(String[] args) {
        // Method 1
        int [] marks = new int [5]; // Declaration & Memory Allocation
        marks [0] = 100 ; marks[1] = 45; marks[2]= 66;
        marks [3] = 44; marks[4]=22; // Intializing array
        // System.out.println(marks[5]);
        // Method 2
        int [] marks1; // Declaration
        marks1 = new int [5]; // Memory Allocation
        marks1 [0] = 100 ; marks1[1] = 45; marks1[2]= 66;
        marks1 [3] = 44; marks1[4]=22; // Intializing array
        // System.out.println(marks1[2]);
        // Method 3
        char [] marks2 = {'a','b','c'}; // Declaration & Initializing array
        System.out.println(marks2[0]);
    }
}