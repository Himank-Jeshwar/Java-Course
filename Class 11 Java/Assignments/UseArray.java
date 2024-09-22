import java.util.*;
class UseArray {
    public static void main() {
        int n,key;
        
        // input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size : ");
        n = sc.nextInt();
        
        // validation before object creation
        if (Array.isValid(n)==true){
            Array oldArray = new Array(n);
            oldArray.input(); // storing elements
            Array sorted = oldArray.insertionSort(); // storing sorted array

            System.out.print("Enter search element : ");
            key = sc.nextInt();

            System.out.print("Original Array : ");
            oldArray.show();
            System.out.print("Sorted Array : ");
            sorted.show();

            if (sorted.binSearch(key)!=-1)
                System.out.println("Element is found at index "+sorted.binSearch(key));
            else
                System.out.println("Element not Found !");
        }
    }    
}
