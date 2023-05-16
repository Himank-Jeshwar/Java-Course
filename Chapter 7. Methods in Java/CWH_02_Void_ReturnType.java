public class CWH_02_Void_ReturnType {
    
    static void greet(){
        System.out.println("Good Evening Sir/Madam,\nHope You Enjoyed.\n\tThanks for visiting.");
    }
    static void changeArray(int []arr){
        arr[0]=18;
    }
    static void changeInt(int a){
        a = 90;
    }
    public static void main(String[] args) {
        // greet();
        
        // Case 1: Changing an integer
        int x = 67;
        changeInt(x); // Copy of the integer is passed.
        System.out.println(x);

        // Case 2: Changing an array
        int [] array1 = {7,2,8,3,1};
        changeArray(array1); // Copy of the reference(address) of the object is passed.
        for (int el:array1){
            System.out.print(el+" ");
        }

    }
}
